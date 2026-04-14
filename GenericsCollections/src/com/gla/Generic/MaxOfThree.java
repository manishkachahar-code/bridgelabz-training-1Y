package com.gla.Generic;

public class MaxOfThree {
    public static <T extends Comparable<T>> T maximum( T x, T y, T z) {
        T max = x;
        if(y.compareTo(max)> 0){
            max = y;
        }
        if(z.compareTo(max) > 0){
            max = z;
        }
        return max;
    }

     public static void main(String[] args) {
         System.out.println("Max Integer:" + maximum( 30 , 40 , 50));
         System.out.println("Max Double:" + maximum(5.5 , 7.9 , 8.7));
    }
}
