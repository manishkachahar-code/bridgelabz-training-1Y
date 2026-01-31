import java.util.Scanner;

public class SumOfNaturalNumbersFor{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check whether the number is a natural number
        if (n <= 0){
            System.out.println("The given number is not a natural number.");
        } else {

            int sumFor = 0;

            // Compute sum using for loop
            for (int i = 1; i <= n; i++){
                sumFor = sumFor + i;
            }

            // Compute sum using formula
            int sumFormula = n * (n + 1) / 2;

            // Print results
            System.out.println("Sum using for loop: " + sumFor);
            System.out.println("Sum using formula n*(n+1)/2: " + sumFormula);

            // Compare results
            if (sumFor == sumFormula) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("Both computations are not equal.");
            }
        }

        sc.close();
    }
}











