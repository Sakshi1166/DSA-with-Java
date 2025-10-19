package JavaLoops;
import java.util.Scanner;
public class raisedpower {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter base number: ");
            int base = sc.nextInt();
            System.out.print("Enter exponent: ");
            int exponent = sc.nextInt();
            int result = 1;

            for (int i = 1; i <= exponent; i++) {
                result *= base; // Multiply result by base
            }

            System.out.println(base + " raised to the power of " + exponent + " is: " + result);
        }
    }
}    

