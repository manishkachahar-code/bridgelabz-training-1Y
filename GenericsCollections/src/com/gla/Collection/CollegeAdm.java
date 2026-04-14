package com.gla.Collection;
import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public int compareTo(Student other) {
        if (this.marks != other.marks) {
            return other.marks - this.marks;
        }
        return this.name.compareTo(other.name);
    }

    public String toString() {
        return name + " (" + marks + ")";
    }

    public int hashCode() {
        return Objects.hash(name, marks);
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student s = (Student) obj;
        return this.name.equals(s.name) && this.marks == s.marks;
    }
}

public class CollegeAdm {
    public static void main(String[] args) {

        List<Student> applicants = new ArrayList<>();

        applicants.add(new Student("Aman", 85));
        applicants.add(new Student("Riya", 92));
        applicants.add(new Student("Karan", 78));
        applicants.add(new Student("Neha", 88));
        applicants.add(new Student("Riya", 92));

        Set<Student> shortlisted = new HashSet<>();

        for (Student s : applicants) {
            if (s.marks >= 80) {
                shortlisted.add(s);
            }
        }

        Queue<Student> interviewQueue = new LinkedList<>(shortlisted);

        TreeSet<Student> meritList = new TreeSet<>();

        Random rand = new Random();

        while (!interviewQueue.isEmpty()) {
            Student s = interviewQueue.poll();
            if (rand.nextBoolean()) {
                meritList.add(s);
            }
        }

        System.out.println("Applicants:");
        for (Student s : applicants) {
            System.out.println(s);
        }

        System.out.println("\nShortlisted Students:");
        for (Student s : shortlisted) {
            System.out.println(s);
        }

        System.out.println("\nFinal Merit List:");
        for (Student s : meritList) {
            System.out.println(s);
        }
    }
}
