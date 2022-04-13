package com.peter;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] a = {33, 3, 2, 22, 1, 111};
        quick(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    public static void quick(int[] a, int l, int h) {
        if (l >= h) {
            return;
        }
        int p = partition(a, l, h);
        quick(a, l, p - 1);
        quick(a, p + 1, h);
    }

    private static int partition(int[] a, int l, int h) {
        // 返回基准点元素所在正确索引
        int pv = a[h]; //基准
        int i = l;
        for (int j = l; j < h; j++) {
            if (a[j] < pv) {
                swap(a, i, j);
                i++;
            }
        }
        swap(a, h, i);
        return i;
    }

    public static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
