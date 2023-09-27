package org.example;

import java.util.Arrays;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        Arrays.sort(strs);
        String firstStr = strs[0];
        String lastStr = strs[strs.length - 1];
        int minLength = Math.min(firstStr.length(), lastStr.length());

        StringBuilder commonPrefix = new StringBuilder();
        for (int i = 0; i < minLength; i++) {
            if (firstStr.charAt(i) == lastStr.charAt(i)) {
                commonPrefix.append(firstStr.charAt(i));
            } else {
                break;
            }
        }

        return commonPrefix.toString();
    }
}
