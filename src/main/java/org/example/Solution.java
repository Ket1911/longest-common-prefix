package org.example;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs, Comparator.comparing(String::length));
        if(strs.length == 0) {
            return "";
        }

        var length = strs[0].length();

        for (int j = 1; j < strs.length; j++) {
            strs[j] = strs[j].substring(0, length);
        }

        while (!strs[0].isEmpty()) {
            if (Arrays.stream(strs).skip(1).allMatch(s -> strs[0].equals(s))) {
                return strs[0];
            }
            length--;
            for (int t = 0; t < strs.length; t++) {
                strs[t] = strs[t].substring(0, length);
            }
        }
        return "";
    }
}
