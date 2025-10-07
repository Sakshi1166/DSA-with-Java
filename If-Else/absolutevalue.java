// Program to find the absolute value of a number
import java.util.Scanner;
public class absolutevalue {
   public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("enter a number:");
        int n =sc.nextInt();
        if (n>0) {
        System.out.println(n + " is a positive number");
        }
        else {
        System.out.println((-n) + " is a absolute value");

       }
   } 
}
}
