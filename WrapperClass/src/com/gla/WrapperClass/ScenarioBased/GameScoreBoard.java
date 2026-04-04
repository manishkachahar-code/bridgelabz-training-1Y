package com.gla.WrapperClass.ScenarioBased;

public class GameScoreBoard {
    public static void main(String[] args) {


        Integer[] scores = {100, 200, null, 150, null, 300};

        int notPlayedCount = 0;
        int totalScore = 0;

        for (Integer score : scores) {


            if (score == null) {
                notPlayedCount++;
            } else {

                totalScore += score;
            }
        }

        // Output
        System.out.println("Players not played: " + notPlayedCount);
        System.out.println("Total Score: " + totalScore);
    }
}

