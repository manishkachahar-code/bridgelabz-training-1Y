package com.gla.Generic;
import java.util.ArrayList;
import java.util.List;

public class CopyListElements {
    public static void copyList(List<? super Number> dest, List<? extends Number> src) {

        for (Number num : src) {
            dest.add(num);   // allowed
        }
    }
    public static void main(String[] args) {

        List<Integer> src = Arrays.asList(10, 20, 30); // source
        List<Number> dest = new ArrayList<>();         // destination

        copyList(dest, src);

        System.out.println(dest);
    }
}
