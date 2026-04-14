package com.gla.Map;
import java.util.*;
public class EmployeeSalary {
    public static void main(String[] args) {

        Map<String, Double> salaries = new HashMap<>();

        salaries.put("Aman", 50000.0);
        salaries.put("Riya", 60000.0);
        salaries.put("Karan", 55000.0);
        salaries.put("Neha", 70000.0);
        salaries.put("Simran", 65000.0);
        salaries.put("Arjun", 70000.0);

        giveRaise(salaries, "Aman", 10);
        giveRaise(salaries, "Riya", 5);
        giveRaise(salaries, "Rahul", 8);

        double total = 0;
        for (double salary : salaries.values()) {
            total += salary;
        }
        double average = total / salaries.size();

        double maxSalary = Collections.max(salaries.values());

        System.out.println("Employee Salaries:");
        for (Map.Entry<String, Double> entry : salaries.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nAverage Salary: " + average);

        System.out.println("\nHighest Paid Employee(s):");
        for (Map.Entry<String, Double> entry : salaries.entrySet()) {
            if (entry.getValue() == maxSalary) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }

    static void giveRaise(Map<String, Double> map, String name, double percent) {
        if (map.containsKey(name)) {
            double newSalary = map.get(name) * (1 + percent / 100);
            map.put(name, newSalary);
            System.out.println("Raised salary of " + name);
        } else {
            System.out.println("Employee not found");
        }
    }
}
