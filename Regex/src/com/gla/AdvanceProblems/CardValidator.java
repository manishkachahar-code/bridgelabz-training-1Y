package com.gla.AdvanceProblems;
import java.util.Scanner;

public class CardValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String card = sc.nextLine();

        String regex = "^(4|5)[0-9]{15}$";

        if (card.matches(regex)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
