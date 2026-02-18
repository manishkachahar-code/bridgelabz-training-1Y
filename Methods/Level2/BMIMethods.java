package com.gla.Methods.Level2;
import java.util.Scanner;
public class BMIMethods {
    public static void calculateBMI(double[][] data) {

        for (int i = 0; i < data.length; i++) {

            double weight = data[i][0];
            double heightCm = data[i][1];

            double heightMeter = heightCm / 100;

            double bmi = weight / (heightMeter * heightMeter);

            data[i][2] = bmi;
        }
    }

    public static String[] getBMIStatus(double[][] data) {

        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {

            double bmi = data[i][2];

            if (bmi < 18.5) {
                status[i] = "Underweight";
            }
            else if (bmi < 25) {
                status[i] = "Normal";
            }
            else if (bmi < 30) {
                status[i] = "Overweight";
            }
            else {
                status[i] = "Obese";
            }
        }

        return status;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] teamData = new double[10][3];

        for (int i = 0; i < 10; i++) {

            System.out.println("Person " + (i + 1));

            System.out.print("Enter weight (kg): ");
            teamData[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm): ");
            teamData[i][1] = sc.nextDouble();
        }

        calculateBMI(teamData);


        String[] status = getBMIStatus(teamData);


        System.out.println("\n---- BMI Report ----");

        for (int i = 0; i < 10; i++) {

            System.out.println("Person " + (i + 1) +
                    " | Weight: " + teamData[i][0] + " kg" +
                    " | Height: " + teamData[i][1] + " cm" +
                    " | BMI: " + teamData[i][2] +
                    " | Status: " + status[i]);
        }

        sc.close();
    }
}

