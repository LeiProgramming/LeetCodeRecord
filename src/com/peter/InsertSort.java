package com.peter;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] a = {1, 11, 3, 33, 4, 55};
        insert(a);
        System.out.println(Arrays.toString(a));
    }

    public static void insert(int[] a) {
        // i 代表待插入元素的索引
        for (int i = 1; i < a.length; i++) {
            int t = a[i]; // 代表待插入的元素值
            int j = i - 1; // 代表已排序区域元素索引
            while (j >= 0) {
                if (t < a[j]) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
                j--;
            }
            a[j + 1] = t;
        }
    }

    public static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
