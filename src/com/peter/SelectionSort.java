package com.peter;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {1, 11, 3, 33, 4, 55};
        selection(a);
        System.out.println(Arrays.toString(a));
    }

    public static void selection(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for (int j = minIndex + 1; j < a.length; j++) {
                if (a[minIndex] > a[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                swap(a, minIndex, i);
            }
        }
    }

    public static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
