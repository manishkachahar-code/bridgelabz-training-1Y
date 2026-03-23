public class ExceptionExample {
public static void main(String[] args) {
int a=10;
int b=0;
try{
int n= a/b ;
System.out.println("Number: "+n);
}
catch (ArithmeticException e){
System.out.println("Divisible by 0");
}
finally {
System.out.println("This program run properly.");
}
}
}