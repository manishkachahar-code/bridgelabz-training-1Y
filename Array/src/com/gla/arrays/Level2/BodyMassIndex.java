package com.gla.arrays.Level2;
import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args){

                Scanner sc = new Scanner(System.in);

                // a. Take input for a number of persons
                System.out.print("Enter the number of persons: ");
                int numPersons = sc.nextInt();

                // b. Create arrays to store the weight, height, BMI, and weight status
                double[] weights = new double[numPersons];
                double[] heights = new double[numPersons];
                double[] bmis = new double[numPersons];
                String[] statuses = new String[numPersons];

                // c. Take input for the weight and height of the persons
                for (int i = 0; i < numPersons; i++) {
                    System.out.println("\nEnter details for person " + (i + 1) + ":");
                    System.out.print("Enter weight in kg: ");
                    weights[i] = sc.nextDouble();
                    System.out.print("Enter height in meters: ");
                    heights[i] = sc.nextDouble();
                }

                // d. Calculate the BMI of all the persons and store them in an array and also find the weight status
                for (int i = 0; i < numPersons; i++) {
                    // Calculate BMI: weight / (height * height)
                    bmis[i] = weights[i] / (heights[i] * heights[i]);

                    // Determine status using the table
                    if (bmis[i] <= 18.4) {
                        statuses[i] = "Underweight";
                    } else if (bmis[i] >= 18.5 && bmis[i] <= 24.9) {
                        statuses[i] = "Normal";
                    } else if (bmis[i] >= 25.0 && bmis[i] <= 39.9) {
                        statuses[i] = "Overweight";
                    } else {
                        statuses[i] = "Obese";
                    }
                }

                // e. Display the height, weight, BMI, and weight status of each person
                System.out.println("\n--- Results ---");
                System.out.printf("%-10s %-10s %-10s %-15s\n", "Height (m)", "Weight (kg)", "BMI", "Status");
                for (int i = 0; i < numPersons; i++) {
                    System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n", heights[i], weights[i], bmis[i], statuses[i]);
                }

                sc.close();
            }
        }
