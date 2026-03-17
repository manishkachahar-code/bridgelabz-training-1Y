package com.gla.Encapsulation;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Discountable {
    void applyDiscount(double percentage);
    String getDiscountDetails();
}

abstract class FoodItem implements Discountable {
    private String itemName;
    private double price;
    private int quantity;
    private double discount = 0.0; // Discount in currency

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public double getDiscount() { return discount; }

    public void setItemName(String name) { this.itemName = name; }
    public void setPrice(double price) { this.price = price; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    protected void setDiscount(double discount) { this.discount = discount; }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("\nItem: " + itemName);
        System.out.println("Unit Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount);
        System.out.println("Total Price: " + calculateTotalPrice());
        System.out.println("---------------------------");
    }

    @Override
    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            discount = calculateTotalPrice() * (percentage / 100.0);
        } else {
            discount = 0;
        }
    }

    @Override
    public String getDiscountDetails() {
        return "Discount Applied: " + discount;
    }
}

class VegItem extends FoodItem {

    public VegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity() - getDiscount();
    }
}

class NonVegItem extends FoodItem {

    private double extraCharge = 20; // extra charge per item

    public NonVegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() + extraCharge) * getQuantity() - getDiscount();
    }
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<FoodItem> order = new ArrayList<>();

        System.out.print("Enter number of items in the order: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nItem " + (i + 1));
            System.out.print("Enter Item Type (1=Veg, 2=Non-Veg): ");
            int type = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Item Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Unit Price: ");
            double price = sc.nextDouble();

            System.out.print("Enter Quantity: ");
            int qty = sc.nextInt();
            sc.nextLine();

            FoodItem item;
            if (type == 1) {
                item = new VegItem(name, price, qty);
            } else {
                item = new NonVegItem(name, price, qty);
            }

            System.out.print("Enter discount percentage (0 if none): ");
            double discount = sc.nextDouble();
            sc.nextLine();

            item.applyDiscount(discount);
            order.add(item);
        }

        System.out.println("\n===== Order Details =====");
        double grandTotal = 0;
        for (FoodItem item : order) {
            item.getItemDetails();
            grandTotal += item.calculateTotalPrice();
        }

        System.out.println("Grand Total: " + grandTotal);
    }

}
