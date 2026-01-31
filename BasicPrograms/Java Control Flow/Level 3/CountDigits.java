import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int count = 0;               // To store number of digits
        int temp = Math.abs(number); // Handle negative numbers

        // Loop until temp becomes 0
        if (temp == 0) {
            count = 1; // Special case for 0
        } else {
            while (temp != 0) {
                temp = temp / 10; // Remove last digit
                count++;
            }
        }

        System.out.println("Number of digits in " + number + " is: " + count);

        sc.close();
    }
}
