package com.gla.Collection;
import java.util.*;
public class NTHElement {
    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {

        Iterator<T> fast = list.iterator();
        Iterator<T> slow = list.iterator();


        for (int i = 0; i < n; i++) {
            if (fast.hasNext()) {
                fast.next();
            }
        }

        T result = null;
        while (fast.hasNext()) {
            fast.next();
            result = slow.next();
        }

        if (result == null && slow.hasNext()) {
            result = slow.next();
        }

        return result;
    }

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>(
                Arrays.asList("A", "B", "C", "D", "E")
        );

        System.out.println(findNthFromEnd(list, 2));
    }
}
