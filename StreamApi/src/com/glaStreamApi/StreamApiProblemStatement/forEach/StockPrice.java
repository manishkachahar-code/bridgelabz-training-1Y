package com.glaStreamApi.StreamApiProblemStatement.forEach;
import java.util.*;
public class StockPrice {
    public static void main(String[] args) {

        List<Double> prices = Arrays.asList(120.5, 121.8, 119.9, 122.3);

        prices.forEach(p -> System.out.println("Price: " + p));
    }

}
