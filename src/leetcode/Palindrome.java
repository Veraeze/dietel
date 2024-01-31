package leetcode;

import java.util.Arrays;

public class Palindrome {
    public static boolean isPalindrome(int x) {
        String[] answer = String.valueOf(x).split("");
        String[] result = reverseArray(answer);
        if (Arrays.equals(answer, result)) return true;
        else return false;
    }
    public static String[] reverseArray(String[] array){
        String[] value = new String[array.length];
        int i = 0;
        for (int count = array.length - 1; count >= 0; count--){
            value[i] = array[count];
            i++;
        }
        return value;
    }
}
