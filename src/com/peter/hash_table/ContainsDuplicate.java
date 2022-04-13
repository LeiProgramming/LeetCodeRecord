package com.peter.hash_table;

import java.util.HashSet;

public class ContainsDuplicate {
}

class SolutionContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length <= 0) {
            return false;
        }

        HashSet<Integer> record = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (record.contains(nums[i])) {
                return true;
            }
            record.add(nums[i]);
        }
        return false;
    }
}
