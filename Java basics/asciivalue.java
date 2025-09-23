
public class asciivalue{
    public static void main (String []args){
        // File: ASCIIvalues.java
        // This file demonstrates how to print ASCII values of characters in Java

        char ch = 'A'; // single quote stores single character
        int x = ch; //implicit typecasting
        System.out.println(x);

        char ch2 = 'a';
        int y = (int)ch2; //explicit typecasting
        System.out.println(y);

        char ch3 = '3';
        System.out.println((int)ch3); //explicit typecasting to print ASCII value directly

        //integer to character conversion
        int c= 43;
        char ch4 =(char) c; //explicit typecasting
        System.out.println(ch4);
    }
}
