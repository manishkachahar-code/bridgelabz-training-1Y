package com.gla.WrapperClass.ScenarioBased;
import java.util.ArrayList;
public class BenchMark {
    public static void main(String[] args) {

        int n = 1_000_000;


        long startArray = System.nanoTime();

        int[] arr = new int[n];


        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }


        long sumArray = 0;
        for (int i = 0; i < n; i++) {
            sumArray += arr[i];
        }

        long endArray = System.nanoTime();


        long startList = System.nanoTime();

        ArrayList<Integer> list = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            list.add(i);
        }


        long sumList = 0;
        for (Integer val : list) {
            sumList += val;
        }

        long endList = System.nanoTime();


        System.out.println("int[] sum: " + sumArray);
        System.out.println("int[] time: " + (endArray - startArray) + " ns");

        System.out.println("ArrayList sum: " + sumList);
        System.out.println("ArrayList time: " + (endList - startList) + " ns");
    }

}
