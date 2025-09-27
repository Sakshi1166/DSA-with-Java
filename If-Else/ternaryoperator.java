// Write a program to find the greatest number among two numbers using the ternary operator.

import java.util.Scanner;
public class ternaryoperator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int max = (a > b) ? a : b; // Ternary operator to find the greatest number between a and b 
            System.out.println("The greatest number is: " + max);
        }
    }
    
}
