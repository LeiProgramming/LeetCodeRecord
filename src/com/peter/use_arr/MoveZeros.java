package com.peter.use_arr;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 1, 0, 2};
        int[] ar1 = Solution_MoveZeros01.moveZeros(arr);
        for (int i = 0; i < ar1.length; i++) {
            System.out.println(ar1[i]);
        }
    }
}

class Solution_MoveZeros01 {
    public static int[] moveZeros(int[] nums) {
        int[] nonZreos = new int[nums.length];
        int j = 0;
        // 取出非零的元素
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nonZreos[j] = nums[i];
                j++;
            }
        }

        // 剩下的元素赋值为0
        while (j < nums.length) {
            nonZreos[j] = 0;
            j++;
        }

        return nonZreos;
    }
}