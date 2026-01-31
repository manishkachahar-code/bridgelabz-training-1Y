import java.util.Scanner;

public class PowerUsingWhileLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take inputs
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        // Initialize result
        int result = 1;

        // Counter variable
        int counter = 0;

        // Calculate power using while loop
        while (counter < power) {
            result = result * number;
            counter++;
        }

        // Print result
        System.out.println(number + " raised to the power " + power + " is: " + result);

        sc.close();
    }
}
