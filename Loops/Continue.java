package JavaLoops;

public class Continue {
    public static void main(String[] args) {
        for (int i = 1; i <=20; i++) {
            if (i%2==1) {
                continue; // Skip the rest of the loop for odd numbers
            }
            System.out.println(i);
        }
        
    }
}
