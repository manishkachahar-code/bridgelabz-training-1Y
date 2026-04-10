package com.gla.PracticeQuestions;
//[5,4,3,2,1]
//[5,3,2,1]
public class MissingNumber {
    public static void main(String[] args){
        int[] arr1 = {5,4,3,2,1}; // array declare
        int[] arr2 = {5,3,2,1};
        int sum1 = 0; // vriables bnaye hai
        int sum2 = 0;
        for(int num: arr1){
            sum1 += num; // array1 ka sum nikala
        }
        for(int num: arr2){
            sum2 += num; // array 2 ka sum nikala hai
        }
        int missing = sum1 - sum2; // find misiing number
        System.out.println("Missing number: " + missing);
    }
}
