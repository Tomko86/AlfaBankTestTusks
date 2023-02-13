package org.example;

import java.util.*;

public class Reverse {

    private static String str = "Никогда не ошибается тот, кто ничего не делает";

    public static void main(String[] args) {
        reverseString(str);
        reverseStringOtherVersion(str);
    }

    private static void reverseString(String str) {
        char[] arrayOfStr = str.toCharArray();
        char[] reversArrayOfStr = new char[arrayOfStr.length];
        for (int i = 0; i < reversArrayOfStr.length; i++) {
            reversArrayOfStr[reversArrayOfStr.length - 1 - i] = arrayOfStr[i];
        }
        System.out.println(String.valueOf(reversArrayOfStr));
    }

    private static void reverseStringOtherVersion(String str) {
        List<Character> listOfChars = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (Character symbol : str.toCharArray()) {
            listOfChars.add(0, symbol);
        }
        listOfChars.forEach(sb::append);
        System.out.println(sb);
    }
}