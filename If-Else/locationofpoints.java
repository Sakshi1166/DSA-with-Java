import java.util.Scanner;
public class locationofpoints {
    public static void main (String[] args){
        try(Scanner sc = new Scanner (System.in)){
            System.out.print("Enter the x coordinate : ");
            int x = sc.nextInt();
            System.out.print("Enter the y coordinate : ");
            int y = sc.nextInt();

            if (x==0 && y==0){
                System.out.println("the point is at the origin");
            }
            else if(x==0){
                System.out.println("the point is on the y axis");
            }
            else if(y==0){
                System.out.println("the point is on the x axis");
            }
            else if(x>0 && y>0){
            System.out.println("the oint lies on the 1st quadrant");
            }
            else if(x<0 && y>0){
                System.out.println("the point lies on the 2nd quadrant");
            }
            else if(x<0 && y<0){
                System.out.println("the point lies on the 3rd quadrant");
            }
            else{
                System.out.println("the point lies on the 4th quadrant");
            
        }
    }
}
}
