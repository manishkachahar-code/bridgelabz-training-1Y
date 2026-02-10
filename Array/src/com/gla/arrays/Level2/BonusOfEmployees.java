package com.gla.arrays.Level2;
import java.util.Scanner;
public class BonusOfEmployees {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // b. Arrays to store salary and years of service
        double[] salary = new double[10];
        double[] years = new double[10];

        // c. Arrays to store bonus and new salary
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // d. Taking input from user
        for (int i = 0; i < 10; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Enter salary: ");
            salary[i] = sc.nextDouble();

            System.out.print("Enter years of service: ");
            years[i] = sc.nextDouble();

            // Validation
            if (salary[i] <= 0 || years[i] < 0) {
                System.out.println("Invalid input! Please enter again.");
                i--; // decrement index
            }
        }

        // e. Calculating bonus and new salary
        for (int i = 0; i < 10; i++) {

            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5% bonus
            } else {
                bonus[i] = salary[i] * 0.02; // 2% bonus
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // f. Printing results
        System.out.println("\n----- Zara Company Bonus Report -----");
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Paid: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);

        sc.close();
    }
}

