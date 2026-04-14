package com.gla.Map;
import java.util.*;
public class InventoryManagement {
    public static void main(String[] args) {

        Map<String, Integer> inventory = new HashMap<>();

        inventory.put("Milk", 10);
        inventory.put("Bread", 5);
        inventory.put("Eggs", 12);

        purchase(inventory, "Milk", 4);
        purchase(inventory, "Bread", 5);

        restock(inventory, "Bread", 10);
        restock(inventory, "Butter", 7);

        query(inventory, "Milk");
        query(inventory, "Bread");
        query(inventory, "Cheese");

        System.out.println("\nFinal Inventory:");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    static void purchase(Map<String, Integer> inventory, String product, int qty) {
        if (inventory.containsKey(product)) {
            int newQty = inventory.get(product) - qty;
            if (newQty <= 0) {
                inventory.remove(product);
                System.out.println(product + " is out of stock");
            } else {
                inventory.put(product, newQty);
                System.out.println("Purchased " + qty + " " + product);
            }
        } else {
            System.out.println(product + " not available");
        }
    }

    static void restock(Map<String, Integer> inventory, String product, int qty) {
        inventory.put(product, inventory.getOrDefault(product, 0) + qty);
        System.out.println("Restocked " + product + " by " + qty);
    }

    static void query(Map<String, Integer> inventory, String product) {
        if (inventory.containsKey(product)) {
            System.out.println(product + " in stock: " + inventory.get(product));
        } else {
            System.out.println(product + " not stocked");
        }
    }

}
