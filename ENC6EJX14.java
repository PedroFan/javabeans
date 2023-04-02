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
public class ENC6EJX14 {
    public static byte e6ex14 () {
        // N famlias;
        // M hijos;
        // averiguar media de edad de los hijos de todas las familias;
        Scanner leer = new Scanner(System.in);
        int n,m,e,i,j;
        double prom=0.0,acumexf=0.0;
        System.out.print("Cantidad de familias: ");
        n=leer.nextInt();
        System.out.println("");
        for (i=0;i<n;i++) {
            System.out.println("Familia " + (i+1));
            System.out.print("Cantidad de hijos: ");
            m=leer.nextInt();
            System.out.println("");
            for (j=0;j<m;j++) {
                System.out.println("Hijo " + (j+1));
                System.out.print("Edad: ");
                e=leer.nextInt();
                System.out.println("");
                acumexf=acumexf+e;
            }
            prom=prom+acumexf/m;
            System.out.println("Promedio de edad de esta familia: " + acumexf/m);
            System.out.println("");
            acumexf=0;
        }
        System.out.println("Promedio de edad de todas las familias: " + prom/n);
        return 31;
    }
}
