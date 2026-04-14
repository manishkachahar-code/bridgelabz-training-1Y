package com.gla.Map;
import java.util.*;
public class WordFreq {
    public static void main(String[] args) {

        String sentence = "Java is fun and Java is powerful";

        Map<String, Integer> wordCount = new HashMap<>();

        sentence = sentence.toLowerCase().replaceAll("[^a-z ]", "");
        String[] words = sentence.split("\\s+");

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word Frequency:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

}
