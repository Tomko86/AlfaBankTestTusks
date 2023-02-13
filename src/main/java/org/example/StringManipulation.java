package org.example;

import java.util.List;

public class StringManipulation {

    private static String str = "Работать нужно не 12 часов, а головой!";

    public static void main(String[] args) {
        deleteSymbol(str);
        calculateSymbolInWord(str);
        printStringThreeTimes(str);
    }

    private static void deleteSymbol(String str) {
        str = str.replace("!", "");
        System.out.println("Строка после удаелния символа <!>: " + str + "\n");
    }

    private static void calculateSymbolInWord(String str) {
        List<Character> listSymbols = List.of('В', 'в', 'B');
        char[] chars = str.toCharArray();
        int count = 0;
        for (char symbol : chars) {
            if (listSymbols.contains(symbol)) {
                count++;
            }
        }
        System.out.println("Количество символов <в> в строке: " + count + "\n");
    }

    private static void printStringThreeTimes(String str) {
        System.out.println("Напечатать строку с разделителем три раза: ");
        int countOfTimes = 3;
        for (int i = 1; i <= 3; i++ ) {
            if (i != countOfTimes) {
                System.out.print(str + " ");
            } else
                System.out.println(str);
        }
    }
}
