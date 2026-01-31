import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check for Gregorian calendar year
        if (year < 1582) {
            System.out.println("Year should be 1582 or later (Gregorian calendar).");
        } else {

            /* -------- PART 1: Using multiple if-else statements -------- */
            if (year % 400 == 0) {
                System.out.println("PART 1: " + year + " is a Leap Year");
            } else if (year % 100 == 0) {
                System.out.println("PART 1: " + year + " is not a Leap Year");
            } else if (year % 4 == 0) {
                System.out.println("PART 1: " + year + " is a Leap Year");
            } else {
			 System.out.println("PART 1: " + year + " is not a Leap Year");
            }

            /* -------- PART 2: Using one if statement with logical operators -------- */
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("PART 2: " + year + " is a Leap Year");
            } else {
                System.out.println("PART 2: " + year + " is not a Leap Year");
            }
        }

        sc.close();
    }
}