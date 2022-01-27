package com.peter.hash_table;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class IntersectionOfTwoArrays {
}

class SolutionIntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> record = new TreeSet<>();
        for (int i = 0; i < nums1.length; i++) {
            record.add(nums1[i]);
        }

        Set<Integer> resultSet = new TreeSet<>();
        for (int i = 0; i < nums2.length; i++) {
            if (record.contains(nums2[i])) {
                resultSet.add(nums2[i]);
            }
        }

        int[] arr = new int[resultSet.size()];
        int index = 0;
        for (Integer num : resultSet)
            arr[index++] = num;

        return arr;
    }
}