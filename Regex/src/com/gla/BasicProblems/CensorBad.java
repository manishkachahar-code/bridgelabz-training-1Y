package com.gla.BasicProblems;
import java.util.*;

public class CensorBad {
    public static void main(String[] args) {
        String text = "This is a damn bad example with some stupid words.";

        String[] badWords = {"damn", "stupid"};

        String regex = "\\b(" + String.join("|", badWords) + ")\\b";

        String result = text.replaceAll(regex, "****");

        System.out.println(result);
    }

}
