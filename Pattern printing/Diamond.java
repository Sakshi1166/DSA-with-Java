package JavaPatternprinting;
import java.util.Scanner;
public class Diamond {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("enter the no. : ");
            int n = sc.nextInt();
            int nsp=n-1, nst=1;

            for(int i=1;i<=n;i++){
                for(int j=1;j<=nsp;j++){
                    System.out.print("  ");
                }
                for(int j=1;j<=nst;j++){
                    System.out.print("* ");
                }
                nsp--;
                nst+=2;
                System.out.println();
            }
            int nsp2=1, nst2=2*n-3;
            for(int i=1;i<=n-1;i++){
                for(int j=1;j<=nsp2;j++){
                    System.out.print("  ");
                }
                for(int j=1;j<=nst2;j++){
                    System.out.print("* ");
                }
                nsp2++;
                nst2-=2;
                System.out.println();
            }
        }
    }
}

            