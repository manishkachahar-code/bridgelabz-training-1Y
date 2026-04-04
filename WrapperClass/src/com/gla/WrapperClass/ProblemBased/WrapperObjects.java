package com.gla.WrapperClass.ProblemBased;
import java.util.ArrayList;
public class WrapperObjects {
    public static void main(String[] args){
        double[] prices = {10.5,20.0,35.75,5.5};
        ArrayList<Double>list = new ArrayList<>();
        for(double p:prices){
            list.add(p);
        }
        double max = list.get(0);

        for (Double val : list) {
            if (val > max) {
                max = val;
            }
        }


        double sum = 0;

        for (Double val : list) {
            sum += val;
        }

        double avg = sum / list.size();

        System.out.println("Highest price = " + max);
        System.out.println("Average price = " + avg);
    }
}
