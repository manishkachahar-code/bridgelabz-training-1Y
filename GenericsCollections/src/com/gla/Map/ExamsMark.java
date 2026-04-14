package com.gla.Map;
import java.util.*;
public class ExamsMark {
    public static void main(String[] args) {

        Map<String, Map<String, Integer>> data = new HashMap<>();

        addMarks(data, "Math", "Aman", 85);
        addMarks(data, "Math", "Riya", 92);
        addMarks(data, "Math", "Karan", 78);

        addMarks(data, "Science", "Aman", 88);
        addMarks(data, "Science", "Riya", 95);
        addMarks(data, "Science", "Neha", 91);

        addMarks(data, "English", "Aman", 75);
        addMarks(data, "English", "Riya", 82);
        addMarks(data, "English", "Karan", 89);

        System.out.println("Topper per Subject:");
        for (String subject : data.keySet()) {
            String topper = null;
            int max = 0;

            for (Map.Entry<String, Integer> entry : data.get(subject).entrySet()) {
                if (entry.getValue() > max) {
                    max = entry.getValue();
                    topper = entry.getKey();
                }
            }

            System.out.println(subject + " -> " + topper + " (" + max + ")");
        }

        System.out.println("\nAverage Score per Subject:");
        for (String subject : data.keySet()) {
            int sum = 0;
            int count = 0;

            for (int marks : data.get(subject).values()) {
                sum += marks;
                count++;
            }

            double avg = (double) sum / count;
            System.out.println(subject + " -> " + avg);
        }

        System.out.println("\nSubjects with score above 90:");
        for (String subject : data.keySet()) {
            for (int marks : data.get(subject).values()) {
                if (marks > 90) {
                    System.out.println(subject);
                    break;
                }
            }
        }
    }

    static void addMarks(Map<String, Map<String, Integer>> data,
                         String subject, String student, int marks) {

        data.putIfAbsent(subject, new HashMap<>());
        data.get(subject).put(student, marks);
    }
}

