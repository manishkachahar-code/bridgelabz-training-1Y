package com.gla.Generic;
import java.util.*;
abstract class JobRole {
    String name;

    JobRole(String name) {
        this.name = name;
    }

    abstract void evaluate();
}
class SoftwareEngineer extends JobRole {
    SoftwareEngineer() {
        super("Software Engineer");
    }

    void evaluate() {
        System.out.println("Evaluating coding skills...");
    }
}

class DataScientist extends JobRole {
    DataScientist() {
        super("Data Scientist");
    }

    void evaluate() {
        System.out.println("Evaluating data analysis skills...");
    }
}

class ProductManager extends JobRole {
    ProductManager() {
        super("Product Manager");
    }

    void evaluate() {
        System.out.println("Evaluating management skills...");
    }
}
class Resume<T extends JobRole> {
    private T role;

    Resume(T role) {
        this.role = role;
    }

    public void processResume() {
        System.out.println("Processing resume for: " + role.name);
        role.evaluate();
    }
}


class ScreeningSystem {

    public static void screenResumes(List<? extends JobRole> roles) {
        for (JobRole role : roles) {
            System.out.println("Screening: " + role.name);
            role.evaluate();
        }
    }
}
public class AiDriven {


    public class Main {
        public static void main(String[] args) {


            Resume<SoftwareEngineer> r1 = new Resume<>(new SoftwareEngineer());
            Resume<DataScientist> r2 = new Resume<>(new DataScientist());

            r1.processResume();
            r2.processResume();


            List<JobRole> roles = Arrays.asList(
                    new SoftwareEngineer(),
                    new DataScientist(),
                    new ProductManager()
            );

            ScreeningSystem.screenResumes(roles);
        }
    }
}
