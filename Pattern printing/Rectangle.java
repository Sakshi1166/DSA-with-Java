//WAP to print rectangle pattern

package JavaPatternprinting;
import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner (System.in)){
            System.out.print("Enter the number of rows: ");
            int rows = sc.nextInt();
            System.out.print("Enter the number of columns: ");
            int cols = sc.nextInt(); 
            
            for(int i=1; i<=rows; i++){ // Loop for each row
                for(int j=1; j<=cols; j++){ // Loop for each column in the current row
                    System.out.print("* "); // Print a star followed by a space
                }
                
                System.out.println(); // Move to the next line after printing each row
            }
        }
    }
}
