package com.gla.BasicProblems;

import java.util.Scanner;

public class License {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String plate = sc.nextLine();
        String regex = "^[A-Z]{2}[0-9]{4}$";
        if (plate.matches(regex)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
