package Methods;

public class Syntax {

    public static void shravan(){
        karan();
        System.out.println("khushi");
    }
    public static void main(String[] args) { //main function hai--with highest priority--sbse phle yhi chlega
        riyanshi();
    }

    public static void karan() {
        System.out.println("yashika");
    }

    public static void riyanshi() {
        karan();
        shravan();
        System.out.println("ajay");
        shravan();
        
    }

    
}
