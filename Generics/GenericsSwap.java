package com.gla.Generics;

public class GenericsSwap {
    public static<T> void swap(T a, T b){
        T temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping : "+a+" "+b);
    }
    public static void main(String[] args){
        swap(5,10); // method call
        swap( "Jay " , "Veeru");
    }
}
