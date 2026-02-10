package com.gla.arrays.Level2;
import java.util.Scanner;
public class DigitFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;

        // b. Count number of digits
        int count = 0;
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        // c. Store digits in an array
        int[] digits = new int[count];
        temp = number;
        int index = 0;

        while (temp != 0) {
            digits[index] = temp % 10;
            temp = temp / 10;
            index++;
        }

        // d. Frequency array of size 10
        int[] frequency = new int[10];

        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }

        // e. Display frequency
        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " time(s)");
            }
        }

        sc.close();
    }
}
