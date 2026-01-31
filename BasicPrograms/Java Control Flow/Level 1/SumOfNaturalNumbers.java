import java.util.Scanner;

public class SumOfNaturalNumbers{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check whether the number is a natural number
        if (n <= 0) {
            System.out.println("The given number is not a natural number.");
        }else{

            // Sum using while loop
            int sumWhile = 0;
            int i = 1;
            while (i <= n) {
                sumWhile = sumWhile + i;
                i++;
            }

            // Sum using formula
            int sumFormula = n * (n + 1) / 2;

            // Display results
            System.out.println("Sum using while loop: " + sumWhile);
            System.out.println("Sum using formula n*(n+1)/2: " + sumFormula);

            // Compare results
            if (sumWhile == sumFormula) {
                System.out.println("Both computations are correct and equal.");
            }else{
                System.out.println("The results are not equal.");
            }
        }

        sc.close();
}
}








