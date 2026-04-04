package com.gla.WrapperClass.ScenarioBased;

public class InputValidation {
    public static boolean isValidAge(String ageStr) {
        try{
            int age = Integer.parseInt(ageStr);
            if(age>= 18){
                return true;

            }else{
                return false;
            }
        }catch(NumberFormatException e){
            return false;
        }
    }
    public static void main(String [] args){
        System.out.println(isValidAge("21"));
        System.out.println(isValidAge("17"));
        System.out.println(isValidAge("abc"));
    }
}
