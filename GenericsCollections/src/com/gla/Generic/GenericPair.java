package com.gla.Generic;
class Pair<T , U>{
    private T first;
    private U second;
    public void setFirst(T first){
        this.first = first;
    }
    public void setSecond(U second){
        this.second = second;
    }
    public T getFirst(){
        return first;
    }
    public U getSecond(){
        return second;
    }
}
public class GenericPair {
    public static void main(String[] args){
        Pair<String, Integer> student = new Pair<>();
        student.setFirst("Anmol");
        student.setSecond(20);
        System.out.println("First:"+ student.getFirst());
        System.out.println("Second:" + student.getSecond());


    }
}
