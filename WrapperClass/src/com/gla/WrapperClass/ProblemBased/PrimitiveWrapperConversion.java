package com.gla.WrapperClass.ProblemBased;
import java.util.Scanner;
public class PrimitiveWrapperConversion {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer:");
        int num = sc.nextInt();

        Integer obj = Integer.valueOf(num);
        System.out.print("Primitive value:" +obj);
        System.out.print("Wrapper(Integer) value:" +obj);
        sc.close();
    }
}
