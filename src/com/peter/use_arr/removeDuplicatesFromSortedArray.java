package com.peter.use_arr;

public class removeDuplicatesFromSortedArray {

}

//26
class SolutionRemoveDuplicates {
    // 快慢指针法
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int fast = 1, slow = 1;
        while (fast < n) {
            if (nums[fast] != nums[fast - 1]) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
