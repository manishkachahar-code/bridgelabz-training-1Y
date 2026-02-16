package src.com.gla.String.Level1;
import java.util.Scanner;

public class StringComparison {
    public static boolean compareUsingCharAt(String str1 , String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        for(int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)){
                return false;
            }
        }
            return true;

    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string:");
        String s1 = sc.next();
        System.out.print("Enter second string:");
        String s2 = sc.next();
        boolean result1 = compareUsingCharAt(s1 , s2);
        boolean result2 = s1.equals(s2);
        System.out.println("Result using charat():" + result1);
        System.out.println("result using equals():" + result2);
        if(result1 == result2){
            System.out.println("Both methods give the same result.");
        } else{
            System.out.println("The methods give dufferent results.");
        }


    }


}
