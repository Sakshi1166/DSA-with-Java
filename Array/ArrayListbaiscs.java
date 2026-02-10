package Array;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListbaiscs {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(); // basic syntax of arraylist
        arr.add(10); //add() is used to add elements in array
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        System.out.println(arr.get(2)); // this is same as arr[2] that gives element of 2nd index
        arr.set(3,44);         // set() is used to modify elements
        System.out.println(arr); // Method 1 to print the whole arraylist

        int n = arr.size();
        for (int i = 0;i<n;i++){
            System.out.print(arr.get(i) + " "); // Method 2 to print the whole arraylist using for loop
        }
        
        System.out.println();
        for(int ele : arr){
            System.out.print(ele + " "); // Method 3 to print the whole arraylist using for each loop
        }

        System.out.println();
        arr.remove(3); // remove() is used to remove any element
        System.out.println(arr); 
        arr.remove(arr.size()-1); // removes last element from the current size of the arraylist
        System.out.println(arr); 

        arr.add(60); // adds element automatically at the last of arraylist
        arr.add(2,25); // adds element after the specified index in the arraylist
        System.out.println(arr);

        Collections.reverse(arr); //In-built method to reverse the arraylist
        System.out.println(arr);
   }
}
