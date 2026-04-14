package com.gla.Generic;
import java.util.*;
class BookCategory {}
class ClothingCategory {}
class GadgetCategory {}

class Product<T> {
    String name;
    double price;
    T category;

    Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public void display() {
        System.out.println("Product: " + name +
                ", Price: " + price +
                ", Category: " + category.getClass().getSimpleName());
    }
}

class Marketplace {

    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discount = product.price * (percentage / 100);
        product.price -= discount;

        System.out.println("Discount applied! New price: " + product.price);
    }
}
public class Market {
    public static void main(String[] args) {

        Product<BookCategory> book = new Product<>("Java Book", 500, new BookCategory());
        Product<ClothingCategory> cloth = new Product<>("T-Shirt", 800, new ClothingCategory());
        Product<GadgetCategory> gadget = new Product<>("Smartphone", 20000, new GadgetCategory());


        book.display();
        cloth.display();
        gadget.display();

        Marketplace.applyDiscount(book, 10);
        Marketplace.applyDiscount(gadget, 20);


        List<Product<?>> catalog = Arrays.asList(book, cloth, gadget);

        System.out.println("\nCatalog:");
        for (Product<?> p : catalog) {
            p.display();
        }
    }
}
