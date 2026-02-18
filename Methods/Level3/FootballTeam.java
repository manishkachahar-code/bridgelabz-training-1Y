package com.gla.Methods.Level3;

public class FootballTeam {
    public static int[] generateHeights(int size) {

        int[] heights = new int[size];

        for (int i = 0; i < size; i++) {
            heights[i] = 150 + (int)(Math.random() * 101);

        }

        return heights;
    }


    public static int findSum(int[] heights) {

        int sum = 0;

        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }

        return sum;
    }


    public static double findMean(int[] heights) {

        int sum = findSum(heights);
        return (double) sum / heights.length;
    }


    public static int findShortest(int[] heights) {

        int min = heights[0];

        for (int i = 1; i < heights.length; i++) {
            min = Math.min(min, heights[i]);
        }

        return min;
    }


    public static int findTallest(int[] heights) {

        int max = heights[0];

        for (int i = 1; i < heights.length; i++) {
            max = Math.max(max, heights[i]);
        }

        return max;
    }

    public static void main(String[] args) {

        int[] heights = generateHeights(11);

        System.out.println("Player Heights:");

        for (int i = 0; i < heights.length; i++) {
            System.out.println("Player " + (i + 1) + ": " + heights[i] + " cm");
        }

        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("\n--- Team Statistics ---");
        System.out.println("Total Height: " + sum + " cm");
        System.out.println("Mean Height: " + mean + " cm");
        System.out.println("Shortest Height: " + shortest + " cm");
        System.out.println("Tallest Height: " + tallest + " cm");
    }
}


