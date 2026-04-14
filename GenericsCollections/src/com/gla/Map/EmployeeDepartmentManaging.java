package com.gla.Map;
import java.util.*;
public class EmployeeDepartmentManaging {
    public static void main(String[] args) {

        HashMap<Integer, String> empDept = new HashMap<>();

        empDept.put(101, "HR");
        empDept.put(102, "IT");
        empDept.put(103, "Finance");
        empDept.put(104, "IT");
        empDept.put(105, "HR");
        empDept.put(106, "Sales");

        empDept.put(103, "IT");

        System.out.println("Employees in IT Department:");
        for (Map.Entry<Integer, String> entry : empDept.entrySet()) {
            if (entry.getValue().equals("IT")) {
                System.out.println("EmpID: " + entry.getKey());
            }
        }

        Map<String, Integer> deptCount = new HashMap<>();

        for (String dept : empDept.values()) {
            deptCount.put(dept, deptCount.getOrDefault(dept, 0) + 1);
        }

        System.out.println("\nTotal Employees per Department:");
        for (Map.Entry<String, Integer> entry : deptCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

}
