package JavaLoops;
import java.util.Scanner;
public class reverseofno {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            int reversed = 0;

            while (n != 0) {
                int digit = n % 10; // Get the last digit
                reversed = reversed * 10 + digit; // Append it to the reversed number
                n /= 10; // Remove the last digit from the original number
            }

            System.out.println("Reversed Number: " + reversed);
        }
        
}
}

