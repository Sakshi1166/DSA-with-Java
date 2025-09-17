
import java.util.Scanner;

public class simpleintrest{
    public static void main(String [] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter principal: ");
            double principal = sc.nextDouble();
            System.out.print("Enter rate: ");
            double rate = sc.nextDouble();
            System.out.print("Enter time: ");
            double time = sc.nextDouble();
            double si = (principal * rate * time) / 100;
            System.out.println("Simple Interest: " + si);
        }

    }
}