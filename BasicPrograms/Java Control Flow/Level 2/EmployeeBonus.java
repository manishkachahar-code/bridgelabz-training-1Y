import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        // Check eligibility for bonus
        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("You are eligible for a bonus.");
            System.out.println("Bonus amount: " + bonus);
        } else {
            System.out.println("You are not eligible for a bonus.");
            System.out.println("Bonus amount: 0");
        }

        sc.close();
    }
}
