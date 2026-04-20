package com.glaStreamApi.LambdaExpressions;
import java.util.*;
import java.util.stream.*;

public class NameUppercasing {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("john", "alice", "bob");

        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
