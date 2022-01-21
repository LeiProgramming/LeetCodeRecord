package com.peter.use_arr;

public class MoveZeros2 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 1, 0, 2};
        Solution_MoveZeros02.moveZeros(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

class Solution_MoveZeros02 {
    public static void moveZeros(int[] nums) {
        // 构造辅助指针， 记录不为0的元素
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        while (j < nums.length) {
            nums[j] = 0;
            j++;
        }
    }
}