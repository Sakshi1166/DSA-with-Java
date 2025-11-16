package JavaPatternprinting;
import java.util.Scanner;
public class Flippedtriangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number:");
            int n = sc.nextInt();

            for(int i=1;i<=n;i++){
                for(int j=1;j<=n+1-i;j++){
                    //System.out.print(j + " "); // Print numbers from 1 to (n-i+1)
                    System.out.print((char) (j+96) + " "); // Print corresponding characters from A onwards
                    //System.out.print((char)(i+64) + " "); // Print characters for odd positions (1, 3, 5, ...)
                }
                System.out.println();

            }
            
        }
        
    }
    
}

