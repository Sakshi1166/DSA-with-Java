package JavaPatternprinting;
import java.util.Scanner;
public class Verticallyflippedtriangle {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("enter the no: ");
            int n = sc.nextInt();

            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print("  ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print(j+" "); //vertically flipped number triangle
                    System.out.print("* "); //vertically flipped triangle
                    System.out.print((char)(i+64)+ " "); //vertically flipped alphabet triangle
                }
                System.out.println();
            }
        }
        
    }
    
}
