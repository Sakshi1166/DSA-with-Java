/*basic propertiesoFmoduluS
1) a%b = a (if a<b)
2) a%(-b) = a%b 
3) (-a)%b = -(a%b)
Ex= 5%(-2) = 5%2 = 1
(-39)%(-10) = (-39)%10 = _(39%10) = -9 */

public class modulus {
    public static void main(String [] args){
        int a = 5;
        int b = -2;
        System.out.println("a%b = " + (a % b)); // 1
        System.out.println("a%(-b) = " + (a % (-b))); // 1
        System.out.println("(-a)%b = " + ((-a) % b)); // -1
        System.out.println("(-39)%(-10) = " + ((-39) % (-10))); // -9
        System.out.println("(-39)%10 = " + ((-39) % 10)); // -9

    }
}

/*  Division of different data types
 *  int/int = int (ex: 5/2 = 2)
 * double/int = double (ex: 5.0/2 = 2.5)
 * int/double = double  (ex: 5/2.0 = 2.5)
 * double/double = double (ex: 5.0/2.0 = 2.5)
 */



                   
   
