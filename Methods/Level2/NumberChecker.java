package com.gla.Methods.Level2;
import java.util.Scanner;
public class NumberChecker {
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }


    public static int compareNumbers(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];


        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("\nChecking numbers:");

        for (int i = 0; i < numbers.length; i++) {

            if (isPositive(numbers[i])) {

                System.out.print(numbers[i] + " is Positive and ");

                if (isEven(numbers[i])) {
                    System.out.println("Even.");
                } else {
                    System.out.println("Odd.");
                }

            } else {
                System.out.println(numbers[i] + " is Negative.");
            }
        }

        int comparison = compareNumbers(numbers[0], numbers[numbers.length - 1]);

        System.out.println("\nComparing first and last elements:");

        if (comparison == 1) {
            System.out.println("First element is greater than last element.");
        } else if (comparison == 0) {
            System.out.println("First element is equal to last element.");
        } else {
            System.out.println("First element is less than last element.");
        }

        sc.close();
    }
}

