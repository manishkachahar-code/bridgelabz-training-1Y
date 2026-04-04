package com.gla.WrapperClass.ProblemBased;

public class InputConversion {
    public static int safeParseInt(String input) {
        try {
            int num = Integer.parseInt(input);
            return num;
        } catch (NumberFormatException e) {
            return -1;
        }
    }
    public static void main(String [] args){
        System.out.println(safeParseInt("123"));
        System.out.println(safeParseInt("abc"));
        System.out.println(safeParseInt("45.6"));
        System.out.println(safeParseInt("0"));
    }

}
