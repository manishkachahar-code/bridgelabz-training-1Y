package com.gla.WrapperClass.ScenarioBased;
import java.util.ArrayList;
import java.util.Objects;

public class ProductRatingAnalyzer {
    public static void main(String[] args) {


        int[] oldRatings = {4, 5, 3};


        ArrayList<Integer> newRatings = new ArrayList<>();
        newRatings.add(5);
        newRatings.add(null);
        newRatings.add(2);
        newRatings.add(4);


        ArrayList<Integer> allRatings = new ArrayList<>();


        for (int r : oldRatings) {
            allRatings.add(r); // int → Integer
        }



        allRatings.addAll(newRatings);


        int sum = 0;
        int count = 0;

        for (Integer rating : allRatings) {


            if (Objects.nonNull(rating)) {
                sum += rating;
                count++;
            }
        }

        double average = (count > 0) ? (double) sum / count : 0.0;


        System.out.println("All Ratings: " + allRatings);
        System.out.println("Average Rating: " + average);
    }

}
