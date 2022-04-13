package com.peter;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        String s = sc.next();

        System.out.println(count(s, k));
    }

    public static int count(String s, int k) {
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                strings.add(s.substring(i, j));
            }
        }

        int res = 0;
        for (String str : strings) {
            HashSet<Character> characters = new HashSet<>();
            for (int i = 0; i < str.length(); i++) {
                char ch = s.charAt(i);
                characters.add(ch);
            }
            if (characters.size() >= k) {
                res++;
            }
        }

        return res;
    }

}
