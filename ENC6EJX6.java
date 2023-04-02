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
public class ENC6EJX6 {
    public static void e6ex6 () {
        // promedio <1.6;
        // promedio gral;
        Scanner leer = new Scanner(System.in);
        double promediogral, promediounoseis,altura, acum=0.0, acumunoseis=0.0;
        System.out.print("Ingrese cantidad de alturas: ");
        int i, j=0, k=0, n = leer.nextInt();
        for (i=0;i<n;i++) {
            System.out.println("Ingrese altura: ");
            altura=leer.nextDouble();
            System.out.println("Altura: " + altura);
            if (altura<(1.6)) {
                acumunoseis=acumunoseis+altura;
                acum=acum+altura;
                j++;
                k++;
            } else {
                acum=acum+altura;
                k++;
            }
        }
        System.out.println("Promedio < 1.6m : " + acumunoseis/j + " acumunoseis: " + acumunoseis + " j: " + j);
        System.out.println("Promedio general: " + acum/k + " acum: " + acum + " k: " + k);
    }
}
