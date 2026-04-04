package com.gla.WrapperClass.ScenarioBased;

public class BankTransaction {
    public static double getRemainingLimit(Double limit) {
        if (limit == null) {
            return 0.0;
        }

        // Step 2: Return actual limit
        return limit;
    }

    public static void main(String[] args) {

        Double limit1 = 5000.0;
        Double limit2 = null;

        System.out.println(getRemainingLimit(limit1)); // 5000.0
        System.out.println(getRemainingLimit(limit2)); // 0.0
    }

    }
