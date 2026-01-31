import java.util.Scanner;

public class OddEvenNumbers{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        // Check for natural number
        if (number <= 0){
            System.out.println("Please enter a natural number greater than 0.");
        }else{

            // Iterate from 1 to number using for loop
            for (int i = 1; i <= number; i++) {

                // Check odd or even
                if (i % 2 == 0) {
                    System.out.println(i + " is an Even number");
                }else{
                    System.out.println(i + " is an Odd number");
                }
            }
        }

        sc.close();
    }
	}








