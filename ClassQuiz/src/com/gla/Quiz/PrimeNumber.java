package com.gla.Quiz;
import java.util.ArrayList;

public class PrimeNumber {
    public static void main(String[] args) {
        ArrayList<Integer> primes = new ArrayList<>();
        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {

            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            primes.add(num);

        }

        System.out.println("Primes 1 - 100":" + primes);


    }
}


