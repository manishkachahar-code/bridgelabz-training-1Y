package com.gla.Collection;
import java.util.*;
public class RotateEle {
    public static <T> void rotateLeft(List<T> list, int k) {
        int n = list.size();
        k = k % n;


        List<T> temp = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            temp.add(list.get(i));
        }


        for (int i = k; i < n; i++) {
            list.set(i - k, list.get(i));
        }


        for (int i = 0; i < k; i++) {
            list.set(n - k + i, temp.get(i));
        }
    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        rotateLeft(list, 2);

        System.out.println(list);
    }
}
