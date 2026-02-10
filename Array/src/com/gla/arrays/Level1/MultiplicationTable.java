package com.gla.arrays.Level1;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[]args) {
        int[] table = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }
        System.out.println("Multiplication Table of " + number +":");
        for(int i = 1; i<= 10 ; i++){
            System.out.println(number + "*"+ table[i - 1]);
        }
        sc.close();
    }
}
