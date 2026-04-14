package com.gla.Map;

import java.util.HashMap;
import java.util.*;
public class InvertMap {
    public static void main(String[] args) {

        Map<String, Integer> input = new HashMap<>();
        input.put("A", 1);
        input.put("B", 2);
        input.put("C", 1);

        Map<Integer, List<String>> inverted = new HashMap<>();

        for (Map.Entry<String, Integer> entry : input.entrySet()) {
            int value = entry.getValue();
            String key = entry.getKey();

            inverted.putIfAbsent(value, new ArrayList<>());
            inverted.get(value).add(key);
        }

        System.out.println("Inverted Map:");
        System.out.println(inverted);
    }
}

