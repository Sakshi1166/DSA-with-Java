// Program to find whether area is greater than perimeter or not
import java.util.Scanner;
public class areaandperimeter {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the length :");
            int l = sc.nextInt();
            System.out.print("Enter the breadth :");
            int b = sc.nextInt();

            int area=l*b;
            int perimeter=2*(l+b);

            if (area>perimeter){
                System.out.println("Area is greater than perimeter");
            }
            else if(perimeter>area){
                System.out.println("Perimeter is greater than area");
            }
            else{
                System.out.println("Area and perimeter are equal");
            }
        }
        
    }
    
}
