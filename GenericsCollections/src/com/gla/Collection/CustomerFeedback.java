package com.gla.Collection;
import java.util.*;
public class CustomerFeedback {
    public static void main(String[] args) {

        // 1. Store all feedback (List)
        List<String> feedbackList = new ArrayList<>();
        feedbackList.add("Good service");
        feedbackList.add("Fast delivery");
        feedbackList.add("Good service"); // duplicate
        feedbackList.add("Excellent support");
        feedbackList.add("Fast delivery"); // duplicate
        feedbackList.add("Nice experience");

        // 2. Remove duplicates (Set)
        Set<String> uniqueFeedback = new LinkedHashSet<>(feedbackList);

        // 3. Queue for processing feedback
        Queue<String> feedbackQueue = new LinkedList<>(uniqueFeedback);

        // 4. Stack to track recent feedback
        Stack<String> recentStack = new Stack<>();

        System.out.println("Processing Feedback:");

        // Process feedback in FIFO order
        while (!feedbackQueue.isEmpty()) {
            String feedback = feedbackQueue.poll();
            System.out.println("Processing: " + feedback);

            // Push into stack for recent tracking
            recentStack.push(feedback);
        }

        // 5. Display last few feedbacks
        System.out.println("\nMost Recent Feedbacks:");

        int count = 3; // show last 3 feedbacks
        while (!recentStack.isEmpty() && count > 0) {
            System.out.println(recentStack.pop());
            count--;
        }
    }
}
