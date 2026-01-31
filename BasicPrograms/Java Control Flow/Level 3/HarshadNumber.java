import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // b. Take input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int originalNumber = number; // Store original number
        int sum = 0;                 // c. Initialize sum

        // d. Loop to access each digit
        while (originalNumber != 0) {
            int digit = originalNumber % 10; // Get last digit
            sum += digit;                     // e. Add digit to sum
            originalNumber = originalNumber / 10; // Remove last digit
        }

        // f. Check divisibility
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number");
        } else {
            System.out.println(number + " is not a Harshad Number");
        }

        sc.close();
    }
}






