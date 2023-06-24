package com.leetcode.solutions;

import java.util.Arrays;
import java.util.HashMap;

/*
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * */
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        for(int i=0; i< nums.length; i++) {
            int otherNum = target - nums[i];
            if(numMap.containsKey(otherNum)) {
                return new int[]{numMap.get(otherNum), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] nums = {2,11,15,7};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
