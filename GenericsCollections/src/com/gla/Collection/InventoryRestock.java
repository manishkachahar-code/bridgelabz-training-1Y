package com.gla.Collection;
import java.util.*;

class Product {
    String name;
    double price;
    int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String toString() {
        return name + " | Price: " + price + " | Stock: " + stock;
    }
}

public class InventoryRestock {
    public static void main(String[] args) {

        Set<String> productNames = new HashSet<>();
        List<Product> productList = new ArrayList<>();
        Queue<Product> restockQueue = new LinkedList<>();
        Stack<Product> restockStack = new Stack<>();

        addProduct(productNames, productList, new Product("Milk", 50, 5));
        addProduct(productNames, productList, new Product("Bread", 30, 2));
        addProduct(productNames, productList, new Product("Eggs", 60, 10));
        addProduct(productNames, productList, new Product("Milk", 55, 8));

        int threshold = 5;

        for (Product p : productList) {
            if (p.stock <= threshold) {
                restockQueue.add(p);
            }
        }

        while (!restockQueue.isEmpty()) {
            Product p = restockQueue.poll();
            p.stock += 10;
            restockStack.push(p);
            System.out.println("Restocked: " + p.name);
        }

        if (!restockStack.isEmpty()) {
            Product last = restockStack.pop();
            last.stock -= 10;
            System.out.println("\nUndo Restock: " + last.name);
        }

        System.out.println("\nFinal Inventory:");
        for (Product p : productList) {
            System.out.println(p);
        }
    }

    static void addProduct(Set<String> set, List<Product> list, Product p) {
        if (!set.contains(p.name)) {
            set.add(p.name);
            list.add(p);
        } else {
            System.out.println("Duplicate Product: " + p.name);
        }
    }
}
