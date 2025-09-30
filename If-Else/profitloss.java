import java.util.Scanner;
public class profitloss { 
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the cost price:");
            int cp = sc.nextInt();
            System.out.print("Enter the selling price:");
            int sp = sc.nextInt();

            if(sp>cp){
                System.out.println( "Profit" + (sp-cp));
            }
            else if(cp>sp){
                System.out.println( "loss" + (cp-sp));
            }
            else 
            {
                System.out.println("No profit No loss");
            }

        }
        
    }
    
}
