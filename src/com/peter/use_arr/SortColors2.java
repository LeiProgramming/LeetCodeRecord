package com.peter.use_arr;

public class SortColors2 {

}

//75 三路快排partition的应用
class SolutionSortColors2 {
    //交换两个元素的值
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void sortColors(int[] nums) {
        int zero = -1; // nums[0, zero] == 0
        int two = nums.length; //nums[two, n-1] == 2
        for (int i = 0; i < two; ) {
            if (nums[i] == 1) {
                i++;
            } else if (nums[i] == 2) {
                two--;
                swap(nums, i, two);
            } else {
                assert (nums[i] == 0);
                zero++;
                swap(nums, zero, i); // swap(nums, ++zero, i++);
                i++;
            }
        }

    }
}
