package com.leetcode.solutions;
/*
* Given an integer x, return true if x is a palindrome, and false otherwise.
* Input: x = 121
* Output: true
* Explanation: 121 reads as 121 from left to right and from right to left.
* Input: x = -121
* Output: false
* Explanation: -121 reads as 121- in reverse.
* */
public class Palindrome {
    public static boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        int oldNumber = x;
        int newNumber = 0;
        while(x/10 != 0) {
            newNumber = newNumber*10 + x%10;
            x = x/10;
        }
        newNumber = newNumber*10 + x%10;
        return newNumber == oldNumber;
    }

    public static void main(String[] args) {
        boolean result = isPalindrome(121);
        System.out.println(result);
    }
}
