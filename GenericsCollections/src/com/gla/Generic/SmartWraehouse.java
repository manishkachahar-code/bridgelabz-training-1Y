package com.gla.Generic;
import java.util.*;
abstract class WarehouseItem {
    String name;

    WarehouseItem(String name) {
        this.name = name;
    }

    abstract void display();
}
class Electronics extends WarehouseItem {
    Electronics(String name) {
        super(name);
    }

    void display() {
        System.out.println("Electronics Item: " + name);
    }
}

class Groceries extends WarehouseItem {
    Groceries(String name) {
        super(name);
    }

    void display() {
        System.out.println("Grocery Item: " + name);
    }
}

class Furniture extends WarehouseItem {
    Furniture(String name) {
        super(name);
    }

    void display() {
        System.out.println("Furniture Item: " + name);
    }
}



class Storage<T extends WarehouseItem> {
    private ArrayList<T> items = new ArrayList<>();

    // Add item
    public void addItem(T item) {
        items.add(item);
    }

    // Get items
    public ArrayList<T> getItems() {
        return items;
    }
}



class WarehouseSystem {

    public static void displayAll(List<? extends WarehouseItem> list) {
        for (WarehouseItem item : list) {
            item.display();
        }
    }
}
public class SmartWraehouse {
    public static void main(String[] args) {


        Storage<Electronics> eStore = new Storage<>();
        eStore.addItem(new Electronics("Laptop"));
        eStore.addItem(new Electronics("Mobile"));

        Storage<Groceries> gStore = new Storage<>();
        gStore.addItem(new Groceries("Rice"));
        gStore.addItem(new Groceries("Wheat"));


        System.out.println("Electronics:");
        WarehouseSystem.displayAll(eStore.getItems());

        System.out.println("\nGroceries:");
        WarehouseSystem.displayAll(gStore.getItems());
    }
}
