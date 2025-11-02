//Java program to print the following pattern

package JavaPatternprinting;
import java.util.Scanner;
public class Alphabetsquare {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner (System.in)){
            System.out.print("Enter the number:");
            int n = sc.nextInt();

            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    System.out.print((char)(j+64)+ " "); // Print the character corresponding to the ASCII value for uppercase example A=65
                    //System.out.print((char)(i+64)+ " "); // Print the row character in each column
                    //System.out.print((char)(j+96)+ " "); // Print the character corresponding to the ASCII value for lowercase example a=97
                }
                System.out.println(); // Move to the next line after printing each row    
            } 
        }
    }
}
    

