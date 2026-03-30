package com.gla.Thread;

public class Task1 extends Thread{
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Task 1 (Low Priority) - " + i);
        }
    }
}

class Task2 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task 2 (Medium Priority) - " + i);
        }
    }
}

class Task3 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Task 3 (High Priority) - " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();
        Task3 t3 = new Task3();

// Set Names
        t1.setName("Thread-LOW");
        t2.setName("Thread-MEDIUM");
        t3.setName("Thread-HIGH");

// Set Priorities
        t1.setPriority(Thread.MIN_PRIORITY); // 1
        t2.setPriority(Thread.NORM_PRIORITY); // 5
        t3.setPriority(Thread.MAX_PRIORITY); // 10

// Print from main (optional)
        System.out.println(t1.getName() + " Priority: " + t1.getPriority());
        System.out.println(t2.getName() + " Priority: " + t2.getPriority());
        System.out.println(t3.getName() + " Priority: " + t3.getPriority());

// Start Threads
        t3.start();
        t3.join();
        t2.start();
        t2.join();
        t1.start();


    }
}
