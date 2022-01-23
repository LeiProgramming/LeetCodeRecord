package com.peter.use_arr;

public class TwoSumII {
}

// 对撞指针
class SolutionTwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int i = 0;
        int j = numbers.length - 1;
        while (numbers[i] + numbers[j] != target) {
            if (numbers[i] + numbers[j] > target) {
                j--;
            } else {
                i++;
            }
        }
        res[0] = i + 1;
        res[1] = j + 1;
        return res;
    }
}