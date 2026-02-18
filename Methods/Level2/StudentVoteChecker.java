package com.gla.Methods.Level2;
import java.util.Scanner;
public class StudentVoteChecker {
    public boolean canStudentVote(int age) {


        if (age < 0) {
            return false;
        }

        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] ages = new int[10];   // Array for 10 students

        StudentVoteChecker checker = new StudentVoteChecker();

        for (int i = 0; i < ages.length; i++) {

            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();

            boolean result = checker.canStudentVote(ages[i]);

            if (result) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }

        sc.close();
    }
}




