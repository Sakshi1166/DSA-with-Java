/*  Priorities in ifelse ladder
   1. if else ladder is executed from top to bottom
   2. if any condition is true then that block is executed and rest of the ladder is skipped
   3. if none of the conditions is true then else block is executed
   4. if else ladder is used when we have to check multiple conditions
   5. if else ladder can be used with logical operators (&&, ||)
   6. if else ladder can be nested inside another if else ladder
   7. we should always set the most probable condition at the top of the ladder


 */

// Program to check whether a number is divisible by 3 or 5 or both or none
import java.util.Scanner;
public class ifelseladder {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number :");
            int n = sc.nextInt();

            if (n%3==0)
            System.out.println(n + "Divisible by 3");
            else if(n%5==0)
            System.out.println(n + "Divisible by 5");
            else if(n%3==0 && n%5==0)
            System.out.println(n+ "Divisible by both 3 and 5");
            else
            System.out.println(n + "Not Divisible by both 3 and 5");
            
        }
    }
    
}
