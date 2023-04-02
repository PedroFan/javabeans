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
public class ENC6EJX8 {
    public static void e6ex8 () {
        int num, i=0, j=0, k=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Encuentro 6 - Ejercicio Extra 8");
        System.out.println("--------- - - --------- ----- -");
        System.out.println("");
        System.out.println("número (NUM) x teclado");
        System.out.println("HACE: ");
        System.out.println("    si NUM > 0 acumula ingresos (i)");
        System.out.println("    si NUM % 2 == 0 acumula pares (j) sino acumula impares (k)");
        System.out.println("MIENTRAS NUM % 5 != 0");
        System.out.println("");
        do {
            System.out.print("Ingrese número: ");
            num=leer.nextInt();
            if (num>=0) {
                i++;
                if (num%2==0){
                    j++;
                } else {
                    k++;
                }
            } else {
            }
        }while (num%5!=0);
        System.out.println("Leídos: " + i + " - Pares: " + j + " - Impares: " + k);
    }
}
