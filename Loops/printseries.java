package JavaLoops;

public class printseries {
    public static void main(String[] args) {
        int a=99,  d=-4;
        for (int i = a; i > 0; i-=4) {
            System.out.print(i + " ");
            a += d; //a=a+d
        }
        
    }
    
}
//Output: 99 95 91 87 83 79 75 71 67 63 59 55 51 47 43 39 35 31 27 23 19 15 11 7 3