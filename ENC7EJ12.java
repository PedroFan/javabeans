package eggenjava;
import java.util.Scanner ;


/**
 *
 * @author Josefina
 */
public class ENC7EJ12 {
    
    public static byte e7e12 () {
        Scanner leer = new Scanner(System.in);
        int num1,num2;
        System.out.println("Ingrese primer número: ");
        num1=leer.nextInt();
        System.out.println("Ingrese segundo número: ");
        num2=leer.nextInt();
        esMultiplo(num1,num2);
        return 33;
    }
        
    public static void esMultiplo (int num1, int num2) {
        if (num1%num2==0) {
            System.out.println("El primer número es múltiplo del segundo");
        } else {
            System.out.println("El primer número NO es múltiplo del segundo");    
        }
    }
}