package com.glaStreamApi.StreamApiProblemStatement.StreamApi;
import java.util.*;
import java.util.stream.*;

public class Transforming {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("john", "alice", "bob");

        names.stream()
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }

}
