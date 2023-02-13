package org.example;

public abstract class Palindrome {

    private static String str = "Аргентина манит негра";

    public static void main(String[] args) {
        checkPalindrome(str);
    }

    private static void checkPalindrome(String str) {
        String original = str.replace(" ", "").toLowerCase();
        StringBuilder sb = new StringBuilder(original);
        String palindrome = sb.reverse().toString();
        if (original.equals(palindrome)) {
            System.out.println(str + " - является полиндромом.");
        } else System.out.println(str + " - НЕ является полиндромом.");
    }




}
