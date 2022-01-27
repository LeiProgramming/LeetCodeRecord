package com.peter.use_arr;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {

    }
}

class SolutionLongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int[] freq = new int[256];
        int l = 0, r = -1;
        int res = 0;
        char[] chars = s.toCharArray();

        while (l < chars.length) {
            if (r + 1 < chars.length && freq[chars[r + 1]] == 0) {
                freq[chars[++r]]++;
            } else {
                freq[chars[l++]]--;
            }

            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}

//438 76
