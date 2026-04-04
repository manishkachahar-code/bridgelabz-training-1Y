package com.gla.WrapperClass.ProblemBased;

public class WrapperToPrimitive {
    public static void main(String[] args){
        Double obj = 45.67d;
        double d = obj.doubleValue();
        int i = (int) obj.doubleValue();
        System.out.println("Original object:"+obj);
        System.out.println("Double value:"+d);
        System.out.println("Int value:"+i);
    }
}
