package com.peter;

import java.util.ArrayDeque;
import java.util.Stack;

public class RemoveDuplicatesString {
    public String removeDuplicates(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (stack.isEmpty() || stack.peek() != ch) {
                stack.push(ch);
            } else {
                stack.pop();
            }
        }

        String str = "";
        while (!stack.isEmpty()) {
            str = stack.pop() + str;
        }
        return str;
    }
}
