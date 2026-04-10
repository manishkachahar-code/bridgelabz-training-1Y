package com.gla.ColectionFramework;

import java.util.*;


public class ArrayListPractice {
    public static void main(String[] args){
        ArrayList<Integer>al = new ArrayList<>();
        ArrayList <Integer> ll = new ArrayList<>();
        Vector<Double> vector = new Vector<>();
        Stack<Boolean> stack = new Stack<>();

al.add(11);
al.add(22);
al.add(33);
al.add(44);
        System.out.println(al);
        al.remove(3);
        System.out.println(al);
        al.set(0 ,12);
        System.out.println(al);
        System.out.println(al.isEmpty());
        System.out.println(al.indexOf(10));



    }
}
