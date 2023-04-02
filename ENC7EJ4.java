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
public class ENC7EJ4 {
    public static byte e7e4 () {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int num=leer.nextInt();
        if (esPrimo(num)) {
            System.out.println(num + " es primo");
        } else {
            System.out.println(num + " no es primo");
        }
    return 37;
    }
    
    public static boolean esPrimo (int num) {
        int i,j=0;
        for (i=2;i<=num/2;i++) {
            if (num%i==0){
                j++;
            }
        }
        return j==0;
    }
}
