package Methods;

public class Returnismandatory {
    public static void main(String[] args) {
        System.out.println(ananya(6));
    }
    public static int ananya(int a){
        if(a<5){
            return a;
        }
        return -9;
    }
}
