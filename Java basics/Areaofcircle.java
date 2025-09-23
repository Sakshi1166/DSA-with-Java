//how to take input

import java.util.Scanner; // Corrected import statement

public class Areaofcircle {
    public static void main (String[] args){

        try (Scanner sc = new Scanner(System.in)) {  //input lene k liye scanner bnaya
         
            System.out.print("enter radius:");
            double r = sc.nextDouble();
            double a = 3.14 * r * r;
            System.out.print("Area of circle is: " + a);
        }
        
    }
}

// The code now correctly imports the Scanner class and calculates the area of a circle based on user input.