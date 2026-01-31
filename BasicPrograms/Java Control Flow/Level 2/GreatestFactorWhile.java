import java.util.Scanner;

public class GreatestFactorWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check for valid input
        if (number <= 1) {
            System.out.println("Please enter an integer greater than 1.");
        } else {

            int greatestFactor = 1;
            int counter = number - 1;

            // Find greatest factor using while loop
            while (counter >= 1) {
                if (number % counter == 0) {
                    greatestFactor = counter;
                    break;
                }
                counter--;
            }

            // Display result
            System.out.println(
                "Greatest factor of " + number + " (besides itself) is: " + greatestFactor
            );
        }

        sc.close();
    }
}









