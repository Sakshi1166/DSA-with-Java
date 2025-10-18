package JavaLoops;

/*import java.util.Scanner;
public class printsakshintimes{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)){
            System.out.print("enter the number :");
            int n = sc.nextInt();
            for (int i = 1;i<=n; i++) {
                System.out.println("sakshi");
            
        }
    }

}
}*/

import java.util.Scanner;
public class printsakshintimes{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)){
            System.out.print("enter the number :");
            int n = sc.nextInt();
            for (int i =n;i>1; i--) {
                System.out.println(i);
            
        }
    }

}
}