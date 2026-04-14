package com.gla.Map;
import java.io.*;
import java.util.*;
public class FrequencyCounter {
    public static void main(String[] args) {

        Map<String, Integer> wordCount = new HashMap<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                line = line.toLowerCase().replaceAll("[^a-z ]", "");
                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error reading file");
        }

        System.out.println("Word Frequency:");
        System.out.println(wordCount);
    }
}