// Print the following pattern two patterns:
// 1 2 3 4        //1 1 1 1
// 1 2 3 4        //2 2 2 2
// 1 2 3 4        //3 3 3 3
// 1 2 3 4        //4 4 4 4

package JavaPatternprinting;
import java.util.Scanner;
public class Numbersquare {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner (System.in)){
            System.out.print("Enter the number:");
            int n = sc.nextInt();

            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    System.out.print(j + " "); // Print numbers from 1 to n in each row
                    //System.out.print(i + " "); // Print the row number in each column
                }
                System.out.println();
            }        
        }
    }
}
