public class BreakExample{
    public static void main(String[] args){

        int i = 1;

        while (i <= 10){
            if (i == 5){
                break;   // exit the loop when i is 5
            }

            System.out.println(i);
            i++;
        }
    }
}