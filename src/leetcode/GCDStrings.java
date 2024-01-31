package leetcode;

import java.util.Arrays;
import java.util.Locale;

public class GCDStrings {
    public static void main(String[] args) {

    }


    public static String gcdOfStrings(String str1, String str2) {
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        if (!(str1+str2).equals(str2+str1)) return "";

        String base = "";
        if (str1.length()>str2.length()) base = str2;
        base = str1;
        int shortBase  = Math.max(str1.length(), str2.length()) - Math.min(str1.length(), str2.length());
        return null;
    }


}



