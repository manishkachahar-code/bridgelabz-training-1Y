import java.util.Scanner;

public class YoungestAndTallestFriend {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input ages
        System.out.print("Enter Amar's age: ");
        int ageAmar = sc.nextInt();

        System.out.print("Enter Akbar's age: ");
        int ageAkbar = sc.nextInt();

        System.out.print("Enter Anthony's age: ");
        int ageAnthony = sc.nextInt();

        // Input heights
        System.out.print("Enter Amar's height: ");
        float heightAmar = sc.nextFloat();

        System.out.print("Enter Akbar's height: ");
        float heightAkbar = sc.nextFloat();

        System.out.print("Enter Anthony's height: ");
        float heightAnthony = sc.nextFloat();

        // Find youngest friend
        if (ageAmar <= ageAkbar && ageAmar <= ageAnthony) {
            System.out.println("Youngest friend is Amar");
        } else if (ageAkbar <= ageAmar && ageAkbar <= ageAnthony) {
            System.out.println("Youngest friend is Akbar");
        } else {
            System.out.println("Youngest friend is Anthony");
        }

        // Find tallest friend
        if (heightAmar >= heightAkbar && heightAmar >= heightAnthony) {
            System.out.println("Tallest friend is Amar");
        } else if (heightAkbar >= heightAmar && heightAkbar >= heightAnthony) {
            System.out.println("Tallest friend is Akbar");
        } else {
            System.out.println("Tallest friend is Anthony");
        }

        sc.close();
    }
}








