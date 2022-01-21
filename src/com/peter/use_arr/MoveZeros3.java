package com.peter.use_arr;

public class MoveZeros3 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 1, 0, 2};
        Solution_MoveZeros02.moveZeros(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

class Solution_MoveZeros03 {
    public static void moveZeros(int[] nums) {
        // 构造辅助指针， 记录不为0的元素
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                swap(nums, i, j);
                j++;
            }
        }
    }

    //交换两个元素的值
    public static void swap(int[] nums, int i, int j) {
        int temp = 0;
        nums[i] = temp;
        nums[j] = nums[i];
        temp = nums[j];
    }
}