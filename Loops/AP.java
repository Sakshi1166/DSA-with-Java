package JavaLoops;
import java.util.Scanner;

public class AP {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first term:");
            int a = sc.nextInt();
            System.out.print("Enter common difference:");
            int d = sc.nextInt();
            System.out.print("Enter number of terms:");
            int n = sc.nextInt();
            System.out.print("AP series:");
            int term = a;
            for (int i = 1; i <= n; i++) {
                System.out.print(term + " ");
                term += d;
            }
        }
        
    }
    
}
