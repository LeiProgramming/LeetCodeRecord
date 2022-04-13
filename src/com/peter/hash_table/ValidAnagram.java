package com.peter.hash_table;

import java.util.Arrays;

public class ValidAnagram {
}


class SolutionValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }
}

//49
class SolutionValidAnagramTwo {
    public boolean isAnagram(String s, String t) {
        return false;
    }
}