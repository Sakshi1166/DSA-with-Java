// Write a program to check whether the triangle is valid or not, when the three sides of the triangle are given.

import java.util.Scanner;
public class sidesoftriangle {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter side a : ");
            int a = sc.nextInt();
            System.out.print("Enter side b : ");
            int b = sc.nextInt();
            System.out.print("Enter side c : ");
            int c = sc.nextInt();

            if(a+b>c && b+c>a && c+a>b){
                System.out.println("Triangle is valid");
            }
            else{
                System.out.println("Triangle is not valid");
            }

        }
    }
    
}
