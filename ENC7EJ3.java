/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggenjava;

import java.util.Scanner;

/**
 *
 * @author Josefina
 */
public class ENC7EJ3 {
    public static byte e7e3 () {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese cantidad de EUROS: ");
        double euro = leer.nextDouble();
        String moneda;
        do{
            System.out.print("¿A qué moneda desea convertir? (DOLAR, LIBRA, YEN): ");
            moneda = leer.next();
        } while (!convertir(euro,moneda));
        return 36;
    }
    public static boolean convertir(double euro, String moneda) {
        moneda=moneda.toLowerCase();
        switch(moneda){
            case "dolar":
                System.out.println(""+1.28611*euro);
                break;
            case "libra":
                System.out.println(""+0.86*euro);
                break;
            case "yen":
                System.out.println(""+129.852*euro);
                break;
            default:
                return false;
        }
    return true;
    }
}
