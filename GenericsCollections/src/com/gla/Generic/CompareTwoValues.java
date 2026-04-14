package com.gla.Generic;

 public class CompareTwoValues {

     public static <T> boolean isEqual(T a, T b) {
         return a.equals(b);
     }

     public static void main(String[] args) {
        System.out.println(isEqual(56 , 56));
        System.out.println(isEqual("Hello" , "Hello"));
     }

}
