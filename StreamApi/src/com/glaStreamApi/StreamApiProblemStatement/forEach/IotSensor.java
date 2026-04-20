package com.glaStreamApi.StreamApiProblemStatement.forEach;
import java.util.*;
public class IotSensor {
    public static void main(String[] args) {

        List<Integer> readings = Arrays.asList(45, 70, 30, 85, 60);

        int threshold = 50;

        readings.stream()
                .filter(r -> r > threshold)
                .forEach(r -> System.out.println(r));
    }

}
