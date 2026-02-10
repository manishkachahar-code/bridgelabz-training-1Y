package com.gla.arrays.Level2;
import java.util.Scanner;
public class FriendsComparison {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        // Name of friends
        String[] names = {"Amar" , "Akbar" ,"Anthony"};
        // a.Arrays to store age and height
        int[] age = new int[3];
        double[] height = new double[3];
        // Taking user input
        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details for " + names[i]);

            System.out.print("Enter age: ");
            age[i] = sc.nextInt();

            System.out.print("Enter height (in cm): ");
            height[i] = sc.nextDouble();
        }

        // Assume first friend is youngest and tallest initially
        int youngestIndex = 0;
        int tallestIndex = 0;

        // b. Loop to find youngest and tallest
        for (int i = 1; i < 3; i++) {

            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }

            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // c. Display results
        System.out.println("\n----- Result -----");
        System.out.println("Youngest Friend: " + names[youngestIndex] +
                " (Age: " + age[youngestIndex] + ")");

        System.out.println("Tallest Friend: " + names[tallestIndex] +
                " (Height: " + height[tallestIndex] + " cm)");

        sc.close();
    }
}

