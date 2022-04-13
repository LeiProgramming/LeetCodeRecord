package com.peter;

import java.util.Arrays;

public class Demo001 {
    public static void main(String[] args) {
        int[] nums = {11, 33, 11, 11, 22, 44, 5, 6};
        System.out.println(duplicate(nums));
    }

    public static int duplicate(int[] numbers) {
        // write code here
        if (numbers == null || numbers.length == 0) {
            return -1;
        }
        Arrays.sort(numbers);
        int[] res = new int[numbers[numbers.length - 1]];
        for (int i : numbers) {
            res[i]++;
            if (res[i] == 2) {
                return i;
            }
        }
        return -1;
    }
}
