import java.util.Scanner;

public class Squareofno {
    public static void main(String [] args){

        try (Scanner sc = new Scanner (System.in)){
            System.out.print("enter the no:");
            int a = sc.nextInt();
            System.out.println("square of this no is:" + (a*a));

        }



    }
}