package com.gla.arrays.Level1;
import java.util.Scanner;
public class NumbersCheck {
    public static void main(String[]args){
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length;i++){
    arr[i] = sc.nextInt();
        }
        for(int i = 0; i < arr.length; i++){
            int num = arr[i];
            if(num > 0){
                System.out.println(num + "is positive and");
                if(num%2 == 0){
                    System.out.println("Even");
                }else{
                    System.out.println("Odd");
                }
            } else if (num < 0){
                System.out.println(num + "is Negative");
            }else{
                System.out.println(num + "is Zero");
            }
        }
        if (arr[0] == arr[arr.length -1]){
            System.out.println("First and last elements are equal");
        }else if (arr[0]> arr[arr.length - 1]){
            System.out.println("First element is Greater than last element");
        }else{
            System.out.println("First element is less than last element");
        }
        sc.close();
    }
}
