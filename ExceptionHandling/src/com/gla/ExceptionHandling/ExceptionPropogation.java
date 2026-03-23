package com.gla.ExceptionHandling;

public class ExceptionPropogation {
    static void method1() {
        int result = 10 / 0; // ArithmeticException
    }

    // Method 2: Calls method1()
    static void method2() {
        method1();
    }

    // main method: Handles exception
    public static void main(String[] args) {
        try {
            method2();
        }
        catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }

}
