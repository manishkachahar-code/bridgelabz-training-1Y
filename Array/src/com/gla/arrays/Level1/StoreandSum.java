package com.gla.arrays.Level1;
import java.util.Scanner;
public class StoreandSum {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;
        while (true) {
            System.out.print("Enter a number: ");
            double input = sc.nextDouble();

            // c. Break if input is 0 or negative
            if (input <= 0) {
                break;
            }

            // d. Break if array size reaches 10
            if (index == 10) {
                break;
            }

            // e. Store value in array and increment index
            numbers[index] = input;
            index++;
        }

        // f. Add all stored elements
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // g. Display stored values and total
        System.out.println("\nStored Numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("\nTotal sum = " + total);

        sc.close();
    }
}





