package com.gla.AdvanceProblems;

import java.util.regex.*;
import java.util.*;
public class SSNValidator {
    public static void main(String[] args) {
        String text = "My SSN is 123-45-6789.";

        String regex = "\\b\\d{3}-\\d{2}-\\d{4}\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Valid: " + matcher.group());
        }
    }
}
