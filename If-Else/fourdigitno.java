/* Multiple conditions using && and ||
   AND operator(&&) - this operator works when both conditions are true
   OR operator(||) - this operator works when either one condition is true
*/

//Use of AND operator
/*import java.util.Scanner;
public class fourdigitno{
    public static void main(String[] args) {
       try ( Scanner sc = new Scanner (System.in)){
            System.out.print("Enter the number : ");
            int n = sc.nextInt();

            if(n>999 && n<10000){
                System.out.println(n +" is a four digit number");
            }
            else{
                System.out.println(n+" is not a four digit number");
            }

        }
        
    }

}*/

//Use of OR operator
// Program to check whether a number is a four digit number or not
import java.util.Scanner;
public class fourdigitno{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)){
            System.out.println("Enter the number : ");
            int n = sc.nextInt();

            if(n<999 || n>10000){
                System.out.println(n+ "is not a four digit number");
            }
            else{
                System.out.println(n+ "is a four digit number");
            }

        }
    }
   
    }


