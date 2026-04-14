package com.gla.Generic;
import java.util.List;
public class NumericSum {
    public static double sumNumbers(List<? extends Number> list){
        double sum = 0;
        for(Number num: list){
            sum += num.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(10, 20 , 30);
        System.out.println("Sum of Integers:" + sumNumbers(intList));
        List<Double> doubleList = List.of(2.5, 3.5, 4.0);
        System.out.println("Sum of Doubles: " + sumNumbers(doubleList));
    }
}
