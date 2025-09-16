
import java.util.Scanner;

public class Sumoftwo {
    public static void main(String []args){
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("enter 1st no:");
            int a = sc.nextInt();
            System.out.print("enter 2nd no:");
            int b = sc.nextInt();
            System.out.print("enter 3rd no:");
            int c = sc.nextInt();
            int sum=a+b+c;
            System.out.print("sum of two no is:" + sum);

        }
    }
}