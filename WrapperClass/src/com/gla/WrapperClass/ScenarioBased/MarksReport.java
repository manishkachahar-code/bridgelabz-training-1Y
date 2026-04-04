package com.gla.WrapperClass.ScenarioBased;
import java.util.ArrayList;
public class MarksReport {
    public static void main(String[] args) {


        Object[] marks = {"85", 95, Integer.valueOf(88), "null", "abc", null};

        ArrayList<Integer> validMarks = new ArrayList<>();


        for (Object m : marks) {

            try {
                if (m == null) {
                    continue;
                }

                if (m instanceof Integer) {
                    validMarks.add((Integer) m);
                } else if (m instanceof String) {
                    String str = (String) m;

                    if (str.equalsIgnoreCase("null")) {
                        continue;
                    }

                    int value = Integer.parseInt(str);
                    validMarks.add(value);
                }

            } catch (NumberFormatException e) {

            }
        }


        int sum = 0;
        for (Integer val : validMarks) {
            sum += val;
        }

        double average = validMarks.size() > 0 ? (double) sum / validMarks.size() : 0.0;


        System.out.println("Valid Marks: " + validMarks);
        System.out.println("Average Marks: " + average);
    }
}
