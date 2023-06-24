package com.leetcode.solutions;
/*
* Write a function to find the longest common prefix string amongst an array of strings.
* If there is no common prefix, return an empty string "".
*
* Input: strs = ["flower","flow","flight"]
* Output: "fl"
*
* Input: strs = ["dog","racecar","car"]
* Output: ""
* Explanation: There is no common prefix among the input strings.
* */
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String commonPrefix = strs[0];
        for(int i=1; i< strs.length; i++) {
            commonPrefix = common(commonPrefix, strs[i]);
        }
        return commonPrefix;
    }

    public static String common(String str1, String str2) {
        int length = Math.min(str1.length(), str2.length());
        for(int i=0; i< length; i++) {
            if(str1.charAt(i) == str2.charAt(i))
                continue;
            return i > 0 ? str1.substring(0, i) : "";
        }
        return str1.substring(0,length);
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"flower","flow","flight"};
        String result = longestCommonPrefix(strs);
        System.out.println(result);
    }
}
