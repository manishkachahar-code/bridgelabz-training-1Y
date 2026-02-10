package com.gla.arrays.Level2;
import java.util.Scanner;
public class DynamicDigitArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // b. Initial array size
        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        // c. Index variable
        int index = 0;

        // d. Loop until number becomes 0
        while (number != 0) {

            // a & b. Increase array size if full
            if (index == maxDigit) {
                maxDigit = maxDigit + 10;

                int[] temp = new int[maxDigit];

                // copy old array to new array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                digits = temp; // assign back
            }

            // e. Extract digit
            digits[index] = number % 10;
            number = number / 10;
            index++;
        }

        // g. Variables for largest and second largest
        int largest = 0;
        int secondLargest = 0;

        // h. Find largest and second largest
        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // i. Display result
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        sc.close();
    }
}
