import java.util.Scanner;
public class LargestCheck{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first number:");
        int number1 = sc.nextInt();
        System.out.print("Enter second number:");
        int number2 = sc.nextInt();
        System.out.print("Enter third number:");
        int number3 = sc.nextInt();
System.out.println("Is the first number is largest?" + (number1 > number2 && number1 > number3 ));
System.out.println("Is the second number is largest?" + (number2 > number1 && number2 > number3));
System.out.println(" Is the third number is largest? " + ( number3 > number1 && number3 > number2));
    }
    }
