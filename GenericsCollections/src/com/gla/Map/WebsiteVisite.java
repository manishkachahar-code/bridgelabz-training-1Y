package com.gla.Map;
import java.util.*;
public class WebsiteVisite {
    public static void main(String[] args) {

        Map<String, Integer> visits = new HashMap<>();

        String[] userVisits = {
                "home", "about", "home", "contact", "home",
                "products", "about", "home", "products", "contact"
        };

        for (String page : userVisits) {
            visits.put(page, visits.getOrDefault(page, 0) + 1);
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(visits.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());

        System.out.println("Pages sorted by visits:");
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        String maxPage = null;
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : visits.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxPage = entry.getKey();
            }
        }

        System.out.println("\nMost Visited Page: " + maxPage + " (" + maxCount + " visits)");
    }

}
