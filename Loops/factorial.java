package JavaLoops;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            int fact = 1;

            for (int i = 1; i <= n; i++) {
                fact *= i; // Multiply fact by i
            }

            System.out.println("Factorial of " + n + " is: " + fact);
        }
        
    }
}
