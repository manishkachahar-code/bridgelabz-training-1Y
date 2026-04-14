package com.gla.Collection;
import java.util.*;
public class Reverse {
    public static<T> void reverseList(List<T> list){
        int start = 0;
        int end = list.size() - 1;
        while(start < end){
            T temp = list.get(start);
            list.set(start, list.get(end));

            start++;
            end--;
        }

    }

  public   static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1 , 2, 3 , 4,5));
        reverseList(arrayList);
      System.out.println("Reversed ArrayList:" +arrayList);
      List<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3 , 4, 5));
      reverseList(linkedList);
      System.out.println("Reversed LinkedList:" +linkedList);
    }
}
