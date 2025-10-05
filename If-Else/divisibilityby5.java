// Program to check whether a number is divisible by 5 or not
import java.util.Scanner;
public class divisibilityby5 {

    public static void main (String [] args){
        try (Scanner sc = new Scanner (System.in)){
            System.out.print("enter the number:");
            int n = sc.nextInt();
            
            if (n%5==0){
                System.out.println(n + " is divisible by 5");
            }
            else{
                System.out.println(n + " not divisible by 5");
            }
        }
    }
}
