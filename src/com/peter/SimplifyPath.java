package com.peter;

import java.util.Stack;

public class SimplifyPath {
    public static void main(String[] args) {

    }

    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] strs = path.split("/");
        for (String str : strs) {
            if (str.isEmpty() || str.equals(".")) {
                continue;
            }
            if (str.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(str);
            }
        }
        return "/" + String.join("/", stack);
    }
}
