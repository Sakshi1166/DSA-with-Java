// Program to check whether a number is even or odd
import java.util.Scanner;

public class evenoddno{
    public static void main (String [] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the number:");
            int n = sc.nextInt();
        
            if (n % 2 == 0) {
                System.out.println(n + " is an even no.");
            } else {
                System.out.println(n + " is an odd no.");
            }
        }
    }

 }


