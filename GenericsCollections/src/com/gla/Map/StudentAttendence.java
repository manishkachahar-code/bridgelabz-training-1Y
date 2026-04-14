package com.gla.Map;
import java.util.*;
public class StudentAttendence {
    public static void main(String[] args) {

        Map<String, Integer> attendance = new HashMap<>();

        String[] students = {"Aman", "Riya", "Karan", "Neha", "Simran"};

        for (String s : students) {
            attendance.put(s, 0);
        }

        String[][] monthlyAttendance = {
                {"Aman", "Riya", "Neha"},
                {"Aman", "Karan"},
                {"Riya", "Simran"},
                {"Aman", "Riya", "Karan"},
                {"Neha", "Simran"},
                {"Aman", "Riya"},
                {"Aman", "Karan", "Simran"},
                {"Riya", "Neha"},
                {"Aman", "Simran"},
                {"Karan", "Neha"},
                {"Aman", "Riya", "Simran"},
                {"Aman"},
                {"Riya", "Karan"},
                {"Neha", "Simran"},
                {"Aman", "Riya"}
        };

        for (String[] day : monthlyAttendance) {
            for (String student : day) {
                attendance.put(student, attendance.get(student) + 1);
            }
        }

        System.out.println("Attendance Record:");
        for (Map.Entry<String, Integer> entry : attendance.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        int threshold = 10;

        System.out.println("\nStudents with attendance less than " + threshold + ":");
        for (Map.Entry<String, Integer> entry : attendance.entrySet()) {
            if (entry.getValue() < threshold) {
                System.out.println(entry.getKey());
            }
        }
    }

}
