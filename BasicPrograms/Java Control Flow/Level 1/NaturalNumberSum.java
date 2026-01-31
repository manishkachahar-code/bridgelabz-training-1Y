import java.util.Scanner;
    public class NaturalNumberSum{
        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number:");
            int number = sc.nextInt();
            if (number > 0){
                int sum = number * (number + 1) / 2;
System.out.println(" The sum of " + number + " natural number is" + sum);
 }else{
     System.out.println(" The sum of " + number + " is not a natural number");
 }
        }
    }
