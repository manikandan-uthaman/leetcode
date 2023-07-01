package com.leetcode.solutions;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/*
* Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
* An input string is valid if:
* Open brackets must be closed by the same type of brackets.
* Open brackets must be closed in the correct order.
* Every close bracket has a corresponding open bracket of the same type.
* Input: s = "()[]{}"
* Output: true
*
* Input: s = "(]"
* Output: false
* */
public class ValidParentheses {

    public static boolean isValid(String s) {
        List<Character> opening = Arrays.asList('(', '{', '[');
        Stack<Character> stack = new Stack<>();
        for(int i=0; i< s.length(); i++) {
            char current = s.charAt(i);
            if(opening.contains(current)) {
                stack.push(current);
            } else {
                if(stack.isEmpty())
                    return false;
                Character required= null;
                switch (current) {
                    case ')':
                        required = '(';
                        break;
                    case '}':
                        required = '{';
                        break;
                    case ']':
                        required = '[';
                        break;
                }
                if(stack.pop() != required)
                    return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        boolean result = isValid(")(}");
        System.out.println(result);
    }
}
