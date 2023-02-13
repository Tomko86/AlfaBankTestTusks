package org.example;

import java.util.*;

public class CalcWordInPhrase {

    private static String str = "Упади семь раз и восемь восемь и и и упади упади раз поднимись";

    public static void main(String[] args) {
        calculateWords(str);
    }

    private static void calculateWords(String str) {
        String[] array = str.toLowerCase().split(" ");
        Map<Integer, String> map = new HashMap<>();
        Map<String, Long> result = new HashMap<>();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
            map.put(i, array[i]);
        }
        for (String s : set) {
            long count = map.entrySet().stream().filter(x -> x.getValue().matches(s)).count();
            result.put(s, count);
        }
        System.out.println(result);
    }
}
