package JavaLoops;

public class breakstat {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break; // Exit the loop when i is 3
            }
            System.out.println("Iteration: " + i);
        }
        System.out.println("Loop ended.");
    }
}
