package Array;
public class Linearsearcharray{
    public static void main (String[] args){
        int [] arr ={11, 21 , 40 ,15 , 16 , 18};
        int target= 8;
        int found = -1; // -1 means target is not in array
        for (int i=0;i<arr.length;i++){
            if(arr[i]==target)
                found = i; // if target is found, store the index in found variable
        }
        if (found!=-1) System.out.println("Target found at index: " + found);
        else System.out.println("Target is missing in the array");
    }
}
