package com.gla.Collection;
import java.util.*;

// Book class
class Book {
    String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
public class ManagementSystem {
    public static void main(String[] args) {

        // 1. List of all books
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Java Basics"));
        bookList.add(new Book("Data Structures"));
        bookList.add(new Book("Operating Systems"));
        bookList.add(new Book("Database Systems"));

        // 2. Unique members (Set)
        Set<String> members = new HashSet<>();

        // Register members
        members.add("M101");
        members.add("M102");
        members.add("M101"); // duplicate (ignored)

        System.out.println("Registered Members: " + members);

        // 3. Queue for issuing books
        Queue<Book> issueQueue = new LinkedList<>();

        issueQueue.add(bookList.get(0));
        issueQueue.add(bookList.get(1));
        issueQueue.add(bookList.get(2));

        // 4. Stack for recently returned books
        Stack<Book> returnStack = new Stack<>();

        System.out.println("\nIssuing Books:");

        // Issue books
        while (!issueQueue.isEmpty()) {
            Book issued = issueQueue.poll();
            System.out.println("Issued: " + issued);

            // Simulate return immediately for demo
            returnStack.push(issued);
        }

        // Display returned books stack
        System.out.println("\nRecently Returned Books:");
        for (Book b : returnStack) {
            System.out.println(b);
        }

        // 5. Re-issue most recently returned book
        if (!returnStack.isEmpty()) {
            Book reissued = returnStack.pop();
            System.out.println("\nRe-Issued Book: " + reissued);
        }
    }

}
