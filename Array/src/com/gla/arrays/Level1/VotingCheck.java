package com.gla.arrays.Level1;
import java.util.Scanner;
public class VotingCheck {
    public static void main(String[]args) {
        int[] ages = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            System.out.println("Enter age of student" + (i + 1) + ":");
            ages[i] = sc.nextInt();
        }
        System.out.println("\nVoting Eligibility Result :");
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                System.out.println("Invalid age:" + ages[i]);
            } else if (ages[i] >= 18) {
                System.out.println("The student with the age" + ages[i] + "can vote.");
            } else {
                System.out.println("The students with the ages" + ages[i] + "cannot vote.");
            }
        }
        sc.close();


    }

}
