package com.peter.hash_table;

import java.util.HashSet;

public class ContainsDuplicateII {
}

class SolutionContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || nums.length <= 0) {
            return false;
        }
        if (k < 0) {
            return false;
        }

        HashSet<Integer> record = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (record.contains(nums[i])) {
                return true;
            }
            record.add(nums[i]);

            if (record.size() == k + 1) {
                record.remove(nums[i - k]);
            }
        }
        return false;
    }
}
