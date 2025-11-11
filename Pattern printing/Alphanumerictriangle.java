package JavaPatternprinting;

public class Alphanumerictriangle {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                if(i % 2 == 0) {
                    System.out.print((char)(j + 64) + " "); // Print characters for odd positions (1, 3, 5, ...)
                } else {
                    System.out.print(j + " "); // Print numbers for even positions (2, 4, 6, ...) 
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
    
}
