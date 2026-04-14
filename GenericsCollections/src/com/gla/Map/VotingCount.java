package com.gla.Map;
import java.util.*;
public class VotingCount {
    public static void main(String[] args) {

        Map<String, Integer> votes = new HashMap<>();

        String[] castVotes = {
                "Aman", "Riya", "Aman", "Karan", "Riya",
                "Aman", "Neha", "Karan", "Riya", "Riya"
        };

        for (String candidate : castVotes) {
            votes.put(candidate, votes.getOrDefault(candidate, 0) + 1);
        }

        String winner = null;
        int maxVotes = 0;

        for (Map.Entry<String, Integer> entry : votes.entrySet()) {
            if (entry.getValue() > maxVotes) {
                maxVotes = entry.getValue();
                winner = entry.getKey();
            }
        }

        System.out.println("Vote Count:");
        for (Map.Entry<String, Integer> entry : votes.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nWinner: " + winner + " with " + maxVotes + " votes");
    }

}
