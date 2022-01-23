package com.peter.use_arr;

public class SortColors {

}

//75 计数排序法 统计0、1、2元素个数，放回原数组
class SolutionSortColors {
    public void sortColors(int[] nums) {
        int countZero = 0;
        int countOne = 0;
        int countTwo = 0;

        for (int i = 0; i < nums.length; i++) {
            assert (nums[i] >= 0 && nums[i] <= 2);
            if (nums[i] == 0) {
                countZero++;
            }
            if (nums[i] == 1) {
                countOne++;
            }
            if (nums[i] == 2) {
                countTwo++;
            }
        }
        for (int i = 0; i < countZero; i++) {
            nums[i] = 0;
        }
        for (int i = 0; i < countOne; i++) {
            nums[i + countZero] = 1;
        }
        for (int i = 0; i < countTwo; i++) {
            nums[i + countZero + countOne] = 2;
        }
    }
}
