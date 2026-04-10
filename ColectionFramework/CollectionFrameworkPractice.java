package com.gla.ColectionFramework;

import java.util.*;

public class CollectionFrameworkPractice {
    public static void main(String [] args){
        List l = new ArrayList();
        List l2 = new LinkedList();
        List l3 = new Vector();
        List l4 = new Stack();
        // obj insert krna haii collection mai toh inbulit method
        l.add(10);
        l.add(20);
        l.add("Manishka");
        l.add(5.55);
        System.out.println(l);
        for(int i = 0; i <l.size(); i++){
            System.out.println(l.get(i));
        }
        for (Object a : l) { //for each loop
            System.out.println(a);
        }
System.out.println(l.contains(10));
        l.remove(1);
        System.out.println(l);
        System.out.println(l.isEmpty());
        System.out.println(l.add(1));
        System.out.println(l.containsAll(l2));
    }
}
