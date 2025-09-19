//Relational operators are used to compare two quantities
//Boolean expressions evaluate to true or false based on conditions


public class relationalandboolean {
    public static void main(String[] args){
        // File: relationalandboolean.java
        // This file demonstrates relational operators and boolean expressions in Java

        int a = 5;
        int b = 10;

        // Relational operators
        System.out.println("a < b: " + (a < b)); // true
        System.out.println("a > b: " + (a > b)); // false
        System.out.println("a <= b: " + (a <= b)); // true
        System.out.println("a >= b: " + (a >= b)); // false
        System.out.println("a == b: " + (a == b)); // false
        System.out.println("a != b: " + (a != b)); // true

        // Boolean expressions
        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println("isTrue && isFalse: " + (isTrue && isFalse)); // false
        System.out.println("isTrue || isFalse: " + (isTrue || isFalse)); // true
        System.out.println("!isTrue: " + (!isTrue)); // false
    }

    
}
