import java.util.Scanner;
public class FactorialForLoop{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // Check for natural number
        if (n <= 0){
            System.out.println("Please enter a natural number greater than 0.");
        }else{

            long factorial = 1;

            // Calculate factorial using for loop
            for (int i = 1; i <= n; i++){
                factorial = factorial * i;
            }

            // Print result
            System.out.println("Factorial of " + n + " is: " + factorial);
        }

        sc.close();
    }
	}












