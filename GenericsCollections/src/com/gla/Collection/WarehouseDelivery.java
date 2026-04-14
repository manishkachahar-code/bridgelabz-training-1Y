package com.gla.Collection;
import java.util.*;

class PackageItem {
    String id;
    String address;

    public PackageItem(String id, String address) {
        this.id = id;
        this.address = address;
    }

    public String toString() {
        return id + " -> " + address;
    }
}
public class WarehouseDelivery {
    public static void main(String[] args) {

        Queue<PackageItem> deliveryQueue = new LinkedList<>();
        Set<String> packageIds = new HashSet<>();
        List<PackageItem> delivered = new ArrayList<>();
        Stack<PackageItem> returned = new Stack<>();

        addPackage(deliveryQueue, packageIds, new PackageItem("P101", "Delhi"));
        addPackage(deliveryQueue, packageIds, new PackageItem("P102", "Mumbai"));
        addPackage(deliveryQueue, packageIds, new PackageItem("P103", "Chennai"));
        addPackage(deliveryQueue, packageIds, new PackageItem("P101", "Kolkata"));

        Random rand = new Random();

        while (!deliveryQueue.isEmpty()) {
            PackageItem p = deliveryQueue.poll();
            if (rand.nextBoolean()) {
                delivered.add(p);
            } else {
                returned.push(p);
            }
        }

        System.out.println("Delivered Packages:");
        for (PackageItem p : delivered) {
            System.out.println(p);
        }

        System.out.println("\nReturned Packages:");
        while (!returned.isEmpty()) {
            System.out.println(returned.pop());
        }

        System.out.println("\nSummary:");
        System.out.println("Total Delivered: " + delivered.size());
        System.out.println("Total Returned: " + packageIds.size() - delivered.size());
        System.out.println("Total Unique Packages: " + packageIds.size());
    }

    static void addPackage(Queue<PackageItem> queue, Set<String> set, PackageItem p) {
        if (!set.contains(p.id)) {
            queue.add(p);
            set.add(p.id);
        } else {
            System.out.println("Duplicate Package ID: " + p.id);
        }
    }
}
