package com.gla.Generics;

public class FibonnaciSeries {

      public static <T> void fibo(T n){
         int num =  Integer.parseInt(n.toString());
          int a =0, b = 1;
          System.out.println(a+"\n"+b);
          for(int i = 0; i < num; i++){// less than opertor work nhi kr pyega ye type pta nhi chl prha ise int mai convert kro
           int sum = a + b;
           System.out.println(sum);
           a = b;
           b = sum;

          }

        }
        public static void main(String[] args){
          fibo(5); // method call // int to string method TOString


    }

}
