package Array;

public class missingarray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,5,6};
        int n = arr.length+1;
        int sum = n*(n+1)/2;
        int asum = 0;
        for(int i=0;i<arr.length;i++){
            asum+=arr[i];
        }
        int missingnum=(sum-asum);
        System.out.println("missing no is: " + missingnum);

    }
}
