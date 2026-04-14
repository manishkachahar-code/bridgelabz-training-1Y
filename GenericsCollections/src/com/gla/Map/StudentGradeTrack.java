package com.gla.Map;
import java.util.*;
public class StudentGradeTrack {
    public static void main(String[] args) {

        Map<String, Double> grades = new HashMap<>();

        grades.put("Aman", 85.5);
        grades.put("Riya", 92.0);
        grades.put("Karan", 76.5);
        grades.put("Neha", 88.0);

        grades.put("Aman", 90.0);

        grades.remove("Karan");

        TreeMap<String, Double> sortedGrades = new TreeMap<>(grades);

        System.out.println("Student Grades (Sorted):");
        for (Map.Entry<String, Double> entry : sortedGrades.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
