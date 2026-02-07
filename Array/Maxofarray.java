package Array;
import java.util.Scanner;
public class Maxofarray {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner (System.in)){
            System.out.print("Enter the size of array: ");
            int n = sc.nextInt();
            int [] arr = new int[n];
            System.out.print("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            int max = arr[0];
            for (int i=0;i<n;i++){
                if(arr[i]>max){
                    max= arr[i];
                }
            }
            System.out.println("Max element of the given array is: " + max);
        }
    }
}


