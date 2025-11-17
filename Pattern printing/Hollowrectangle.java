package JavaPatternprinting;
import java.util.Scanner;

public class Hollowrectangle {
    public static void main(String[] args) {
        int rows, cols;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of rows: ");
            rows = sc.nextInt();
            System.out.print("Enter the number of columns: ");
            cols = sc.nextInt();
        }

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("* ");
                } else {
                    System.out.print("# ");
                   // System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}







    

