package com.gla.Collection;
import java.util.LinkedList;
import java.util.Queue;

class StackUsingQueues {
    Queue<Integer> q1;
    Queue<Integer> q2;

    // Constructor
    public StackUsingQueues() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    // Push element onto stack
    public void push(int x) {
        // Step 1: Add new element to q2
        q2.add(x);

        // Step 2: Move all elements from q1 to q2
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        // Step 3: Swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // Pop element from stack
    public int pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return q1.remove();
    }

    // Get top element
    public int top() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return q1.peek();
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return q1.isEmpty();
    }
}
public class ImplementStack {
 public   static void main(String[] args) {
     StackUsingQueues stack = new StackUsingQueues();

     // Push elements
     stack.push(1);
     stack.push(2);
     stack.push(3);

     // Pop element
     System.out.println("Popped: " + stack.pop()); // Output: 3

     // Top element
     System.out.println("Top: " + stack.top());   // Output: 2

     // Check empty
     System.out.println("Is Empty: " + stack.isEmpty());
 }
    }

