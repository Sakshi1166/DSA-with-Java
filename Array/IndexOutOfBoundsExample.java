package Array;

public class IndexOutOfBoundsExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30}; // Array of size 3, valid indices are 0, 1, 2

        // This will cause an ArrayIndexOutOfBoundsException
        // System.out.println(numbers[3]); 

        // This will also cause an ArrayIndexOutOfBoundsException
        System.out.println(numbers[-1]); 

        // Correct access
        //System.out.println(numbers[0]); // Prints 10
    }
}
