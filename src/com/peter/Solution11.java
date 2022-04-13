package com.peter;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Solution11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] data = new Integer[n];
        for (int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
        }
        List<String> anss = c1(data);
        for (String ans : anss) {
            System.out.println(ans);
        }
    }

    public static List<String> c1(Integer[] arr) {
        List<String> list = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 11 == 0 || c2(arr[i])) {
                list.add("yes");
            } else {
                list.add("no");
            }
        }
        return list;
    }

    public static boolean c2(Integer a) {
        String str = a.toString();
        char[] arr = str.toCharArray();
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (arr[i] == '1') {
                index++;
            }
        }
        if (index >= 2) {
            return true;
        }
        return false;
    }
}
