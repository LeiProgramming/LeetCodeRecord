package com.peter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<Long> list = new ArrayList<>();
        for (int i = 2; i <= 16; i++) {
            int jinzhi = i;
            if (jinzhi <= 10) {
                Long num = Long.valueOf(str, jinzhi);
                Long res = num % (int) (1e9 + 7);
                list.add(res);
            } else {

            }

        }
        Collections.sort(list);
        for (Long i : list) {
            System.out.println(i);
        }
    }
}
