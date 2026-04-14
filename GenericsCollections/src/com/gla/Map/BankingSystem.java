package com.gla.Map;
import java.util.*;
public class BankingSystem {
    public static void main(String[] args) {

        Map<String, Double> accounts = new HashMap<>();

        accounts.put("ACC101", 5000.0);
        accounts.put("ACC102", 8000.0);
        accounts.put("ACC103", 3000.0);
        accounts.put("ACC104", 10000.0);
        accounts.put("ACC105", 7000.0);

        deposit(accounts, "ACC101", 2000);
        withdraw(accounts, "ACC102", 3000);
        withdraw(accounts, "ACC103", 5000);

        List<Map.Entry<String, Double>> list = new ArrayList<>(accounts.entrySet());
        list.sort((a, b) -> Double.compare(b.getValue(), a.getValue()));

        System.out.println("Accounts sorted by balance:");
        for (Map.Entry<String, Double> entry : list) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nTop 3 Customers:");
        for (int i = 0; i < Math.min(3, list.size()); i++) {
            Map.Entry<String, Double> entry = list.get(i);
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    static void deposit(Map<String, Double> accounts, String acc, double amount) {
        if (accounts.containsKey(acc)) {
            accounts.put(acc, accounts.get(acc) + amount);
            System.out.println("Deposited " + amount + " to " + acc);
        }
    }

    static void withdraw(Map<String, Double> accounts, String acc, double amount) {
        if (accounts.containsKey(acc)) {
            double balance = accounts.get(acc);
            if (amount > balance) {
                System.out.println("Insufficient balance in " + acc);
            } else {
                accounts.put(acc, balance - amount);
                System.out.println("Withdrew " + amount + " from " + acc);
            }
        }
    }

}
