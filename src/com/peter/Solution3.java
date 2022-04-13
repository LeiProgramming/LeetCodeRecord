package com.peter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * 小美现在在厨房做饭。小美发现食材现在只够每种菜做一份。
 * 现在同一时刻（即不分先后顺序）来了n个顾客。每个顾客都有想两份要点的菜。只有当顾客吃到全部自己想要的菜的
 * 时候，顾客才会满意。
 * 现在你的任务是，合理地接取顾客的订单要求，尽可能让更多的顾客满意，并输出最多有多少顾客可以满意。
 */
public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //n表明有多少顾客前来点菜，m表示小美现在能做的菜的编号范围在[1, m]。
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] guest = new int[n][2];
        for (int i = 0; i < n; i++) {
            guest[i][0] = sc.nextInt();
            guest[i][1] = sc.nextInt();
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            list.add(i);
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            Integer a1 = guest[i][0];
            Integer a2 = guest[i][1];
            if (list.contains(a1) && list.contains(a2)) {
                res += 1;
                list.remove(a1);
                list.remove(a2);
            }
        }
        System.out.println(res);
    }
}
