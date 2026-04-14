package com.gla.Generic;
import java.util.List;
import java.util.*;

abstract class CourseType {
    String courseName;

    CourseType(String courseName) {
        this.courseName = courseName;
    }

    abstract void evaluate();
}

class ExamCourse extends CourseType {
    ExamCourse(String name) {
        super(name);
    }

    void evaluate() {
        System.out.println(courseName + ": Evaluation through Exams");
    }
}

class AssignmentCourse extends CourseType {
    AssignmentCourse(String name) {
        super(name);
    }

    void evaluate() {
        System.out.println(courseName + ": Evaluation through Assignments");
    }
}

class ResearchCourse extends CourseType {
    ResearchCourse(String name) {
        super(name);
    }

    void evaluate() {
        System.out.println(courseName + ": Evaluation through Research Work");
    }
}

class Course<T extends CourseType> {
    private T type;

    Course(T type) {
        this.type = type;
    }

    public void conductCourse() {
        System.out.println("Conducting course: " + type.courseName);
        type.evaluate();
    }
}


class UniversitySystem {

    public static void processCourses(List<? extends CourseType> courses) {
        for (CourseType c : courses) {
            System.out.println("Processing: " + c.courseName);
            c.evaluate();
        }
    }
}
public class University {
    public static void main(String[] args) {


        Course<ExamCourse> c1 = new Course<>(new ExamCourse("Math"));
        Course<AssignmentCourse> c2 = new Course<>(new AssignmentCourse("English"));

        c1.conductCourse();
        c2.conductCourse();


        List<CourseType> courseList = Arrays.asList(
                new ExamCourse("Physics"),
                new AssignmentCourse("History"),
                new ResearchCourse("AI Research")
        );

        UniversitySystem.processCourses(courseList);
    }
}
