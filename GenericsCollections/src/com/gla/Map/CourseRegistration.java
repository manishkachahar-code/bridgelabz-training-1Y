package com.gla.Map;
import java.util.*;
public class CourseRegistration {
    public static void main(String[] args) {

        Map<String, Integer> courses = new HashMap<>();

        courses.put("CS101", 45);
        courses.put("CS102", 52);
        courses.put("CS103", 3);
        courses.put("CS104", 60);
        courses.put("CS105", 10);

        addStudent(courses, "CS101", 3);
        addStudent(courses, "CS103", 2);

        dropStudent(courses, "CS102", 5);
        dropStudent(courses, "CS103", 10);

        System.out.println("Course Registrations:");
        for (Map.Entry<String, Integer> entry : courses.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nNear Full Courses (>= 50):");
        for (Map.Entry<String, Integer> entry : courses.entrySet()) {
            if (entry.getValue() >= 50) {
                System.out.println(entry.getKey());
            }
        }

        System.out.println("\nUnder-Subscribed Courses (< 5):");
        for (Map.Entry<String, Integer> entry : courses.entrySet()) {
            if (entry.getValue() < 5) {
                System.out.println(entry.getKey());
            }
        }
    }

    static void addStudent(Map<String, Integer> courses, String course, int count) {
        if (courses.containsKey(course)) {
            courses.put(course, courses.get(course) + count);
        }
    }

    static void dropStudent(Map<String, Integer> courses, String course, int count) {
        if (courses.containsKey(course)) {
            int newCount = courses.get(course) - count;
            if (newCount < 0) newCount = 0;
            courses.put(course, newCount);
        }
    }

}
