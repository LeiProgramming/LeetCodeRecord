package com.peter;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.size() == 0) {
                    return false;
                }
                char topChar = stack.pop();
                if (topChar != '(' && s.charAt(i) == ')') {
                    return false;
                }
                if (topChar != '[' && s.charAt(i) == ']') {
                    return false;
                }
                if (topChar != '{' && s.charAt(i) == '}') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
