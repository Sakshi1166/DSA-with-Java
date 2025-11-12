package JavaPatternprinting;
import java.util.Scanner;
public class Bridge {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("enter the no. : ");
            int n = sc.nextInt();

            // Bahr wali single line print krega ye loop
            for(int i=1;i<=2*n-1;i++){
                System.out.print("* ");
            }
            System.out.println();

            // Andar wala bridge print krega ye loop
            int nsp = 1;
            for(int i=1;i<=n-1;i++){
                // this loop prints 1st triangle
                for(int j=1;j<=n-i;j++){
                    System.out.print("* ");
                }
                // this loop prints middle spaces
                for(int j=1;j<=nsp;j++){
                    System.out.print("  ");
                }
                // this loop prints last triangle
                for(int j=1;j<=n-i;j++){
                    System.out.print("* ");
                }
                nsp+=2;
                System.out.println();
            }
        }
    }
}

