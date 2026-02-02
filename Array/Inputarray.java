package Array;
import java.util.Scanner;
public class Inputarray {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            //Array bnayi
            int[] arr=new int[7];

            // Array ka Input liya
            for(int i=0;i<7;i++){
                arr[i] = sc.nextInt();
            }

            //Array ka output print kia
            for(int i=0;i<7;i++){
                System.out.print(2*arr[i]+ " ");
            }
        }
    }
}


