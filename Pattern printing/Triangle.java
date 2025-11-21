//WAP to print triangle pattern

package JavaPatternprinting;
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner (System.in)){
            System.out.print("Enter the number: ");
            int n = sc.nextInt();

            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(j +" "); // Print numbers from 1 to n in each row
                    //System.out.print(i +" "); // Print the row number in each column
                    //System.out.print("* "); // Print star pattern
                    //System.out.print((char)(j+64)+ " "); // Print the character corresponding to the ASCII value for uppercase example A=65
                    //System.out.print((char)(j+96)+ " "); // Print the character corresponding
                    //System.out.print((char)(i+64)+ " "); // Print the row character in each column
                    //System.out.print((char)(i+96)+ " "); // Print the row character
                    
                }
                System.out.println();
            }
       }
    }
}    

