package com.peter.hash_table;

import java.util.HashMap;

public class TwoSum {
}

class SolutionTwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> record = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (record.containsKey(complement)) {
                return new int[]{record.get(complement), i};
            }
            record.put(nums[i], i);
        }
        return new int[0];
    }
}

