public class ContinueExample{
    public static void main(String[]args){

        int i = 1;

        while (i <= 10){
            if (i == 5){
                i++;        // increase i before continue
                continue;   // skip the rest of the loop when i is 5
            }

            System.out.println(i);
            i++;
        }
    }
}