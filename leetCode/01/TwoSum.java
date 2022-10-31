package com.hh.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int out[] = solution.twoSum(new int[]{2, 6, 11, 15, 9, 7, 8}, 17);
        for (int i = 0; i < out.length; i++) {
            System.out.println(out[i]);
        }
    }
}

class Solution {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashmap = new HashMap<>(nums.length - 1);
        for (int i = 0; i < nums.length; i++) {
            if (hashmap.containsKey(target - nums[i])) {
                return new int[]{hashmap.get(target - nums[i]), i};
            } else {
                hashmap.put(nums[i], i);
            }
        }

        return new int[]{0};//未找到
    }
}