package org.example;

import java.util.Scanner;

public class WorkWithNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.next());
        processorNumber(number);
        System.out.println("Число Фибонначи для " + number + " - " + getFibonacci(number));
    }

    private static void processorNumber(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " - это четное число.");
        }
        if (number % 10 == 0) {
            System.out.println("Десятая часть числа " + number + " равна - " + number / 10);
        }
        if (number % 3 == 0) {
            factorial(number);
        }
    }

    private static void factorial(int number) {
        System.out.println("Факториал числа " + number + " равен - " + number * (number - 1));
    }

    public static int getFibonacci(int num) {
        if ((num == 1) || (num == 2))
            return 1;
        else
            return getFibonacci(num - 1) + getFibonacci(num - 2);
    }
}
