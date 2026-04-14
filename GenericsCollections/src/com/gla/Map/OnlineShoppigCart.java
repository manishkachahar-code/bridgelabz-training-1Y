package com.gla.Map;
import java.util.*;
public class OnlineShoppigCart {
    public static void main(String[] args) {

        LinkedHashMap<String, Double> cart = new LinkedHashMap<>();

        cart.put("Laptop", 45000.0);
        cart.put("Mouse", 500.0);
        cart.put("Keyboard", 1500.0);
        cart.put("Headphones", 2000.0);

        System.out.println("Products in Cart:");
        for (Map.Entry<String, Double> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + " -> ₹" + entry.getValue());
        }

        double total = 0;
        for (double price : cart.values()) {
            total += price;
        }

        System.out.println("\nTotal Amount: ₹" + total);

        if (total > 5000) {
            double discount = total * 0.10;
            total -= discount;
            System.out.println("Discount Applied (10%): ₹" + discount);
        }

        System.out.println("Final Bill: ₹" + total);

        removeProduct(cart, "Mouse");

        System.out.println("\nCart after removal:");
        for (Map.Entry<String, Double> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + " -> ₹" + entry.getValue());
        }
    }

    static void removeProduct(LinkedHashMap<String, Double> cart, String product) {
        if (cart.containsKey(product)) {
            cart.remove(product);
            System.out.println("\nRemoved: " + product);
        }

    }
}