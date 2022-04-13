package com.peter.hash_table;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
}

class SolutionWordPattern {
    public boolean wordPattern(String pattern, String s) {
        /**
         * 声明两个哈希表，分别确定字符串与字符，字符与字符串之间的对应关系
         */
        Map<String, Character> str2ch = new HashMap<>();
        Map<Character, String> ch2str = new HashMap<>();

        int m = s.length(); // 字符串的长度
        int i = 0;
        for (int p = 0; p < pattern.length(); p++) {
            char ch = pattern.charAt(p);
            if (i >= m) {
                return false;
            }
            /**
             * 找到字符串中的单词
             */
            int j = i;
            while (j < m && s.charAt(j) != ' ') {
                j++;
            }
            String word = s.substring(i, j);

            if (str2ch.containsKey(word) && str2ch.get(word) != ch) {
                return false;
            }
            if (ch2str.containsKey(ch) && !word.equals(ch2str.get(ch))) {
                return false;
            }
            str2ch.put(word, ch);
            ch2str.put(ch, word);
            i = j + 1;
        }
        return i >= m;
    }
}
