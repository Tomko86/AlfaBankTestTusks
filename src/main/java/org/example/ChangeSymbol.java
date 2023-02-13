package org.example;

public class ChangeSymbol {

    private static String str = "Неуд*ч* – это просто возможность н*ч*ть снов*, но уже более мудро.";

    public static void main(String[] args) {
        changeSymbol(str);
    }

    private static void changeSymbol(String str) {
        System.out.println(str);
        str = str.replace('*', 'a');
        System.out.print("Строка после замены <*> на <а>: " + str);
    }
}
