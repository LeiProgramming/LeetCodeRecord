package com.peter.Stack_and_Queue;

import java.util.Stack;

public class ValidParentheses {
}

class SolutionValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char topChar = stack.pop();
                if (s.charAt(i) == ')' && topChar != '(') {
                    return false;
                }
                if (s.charAt(i) == ']' && topChar != '[') {
                    return false;
                }
                if (s.charAt(i) == '}' && topChar != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}