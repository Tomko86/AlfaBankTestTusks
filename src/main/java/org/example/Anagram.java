package org.example;

import java.util.Arrays;

public class Anagram {

    private static String str1 = "обезьянство";
    private static String str2 = "светобоязнь";
    public static void main(String[] args) {
        if (checkAnagram(str1, str2))
            System.out.println(str1 + " - анаграмма слову " + str2);
        else
            System.out.println(str1 + " не анаграмма слову " + str2);
    }

    private static boolean checkAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        } else {
            char[] arrayStr1 = str1.toCharArray();
            char[] arrayStr2 = str2.toCharArray();
            Arrays.sort(arrayStr1);
            Arrays.sort(arrayStr2);
            return Arrays.equals(arrayStr1, arrayStr2);
        }




    }
}
