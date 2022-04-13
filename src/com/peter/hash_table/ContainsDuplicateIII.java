package com.peter.hash_table;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ContainsDuplicateIII {
}

class SolutionContainsDuplicateIII {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (nums == null || nums.length <= 0) {
            return false;
        }
        if (k < 0) {
            return false;
        }

        TreeSet<Long> record = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {

//            if (record.contains(nums[i])){
//                return true;
//            }
            if (record.ceiling((long) nums[i] - (long) t) != null &&
                    record.ceiling((long) nums[i] - (long) t) <= (long) nums[i] + (long) t)
                return true;
            record.add((long) nums[i]);

            if (record.size() == k + 1) {
                record.remove(nums[i - k]);
            }
        }
        return false;
    }
}
