import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // b. Take input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0; // c. Initialize sum of divisors

        // d. Run a loop from 1 to number-1
        for (int i = 1; i < number; i++) {
            // e. Check if i is a divisor
            if (number % i == 0) {
                sum += i; // f. Add to sum
            }
        }

        // g. Check if sum > number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number");
        } else {
            System.out.println(number + " is not an Abundant Number");
        }

        sc.close();
    }
}






