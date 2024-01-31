package leetcode;

import java.util.ArrayList;

public class MergeStrings {
    public static String merge(String word1, String word2){
        int loop = 0;
        StringBuilder value =  new StringBuilder();
        loop = Math.max(word1.length(), word2.length());
        for (int count = 0; count < loop; count++) {
            if (count< word1.length()) {
                value.append(String.valueOf(word1.charAt(count)));
            }
            if (count < word2.length()) {
                value.append(String.valueOf(word2.charAt(count)));
            }
        }
        return value.toString();
    }
}


