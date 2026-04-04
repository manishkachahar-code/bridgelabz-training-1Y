package com.gla.WrapperClass.ProblemBased;

public class UtilityObjects {
    public static void main(String[] args){
        int num = Integer.parseInt("123");
        double d = Double.parseDouble("3.14");
        boolean b = Boolean.parseBoolean("true");
        String bin = Integer.toBinaryString(10);
        boolean check = Character.isDigit('5');
        char ch = Character.toUpperCase('a');
        System.out.println(num);
        System.out.println(d);
        System.out.println(b);
        System.out.println(bin);
        System.out.println(check);
        System.out.println(ch);
    }
}
