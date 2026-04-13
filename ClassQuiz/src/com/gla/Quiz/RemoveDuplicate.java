package com.gla.Quiz;

import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args){
        ArrayList<Integer> list =  new ArrayList<>(Arrays.asList (1,2 ,3 , 3, 4 ,5));
        System.out.println("Original:" +list);
        Set<Integer> set = new LinkedHashSet<> (list);
        list.clear();
        list.addAll(set);
        System.out.println("After Removing Duplicate:" +list);





    }

}
