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
public class ENC6EJX7 {
    public static void e6ex7 () {
        // MAXIMO;
        // MINIMO;
        // PROMEDIO;
        // N NROS X TECLADO;
        // 2 VER: WHILE y DO...WHILE
        Scanner leer = new Scanner(System.in);
        int i=0,n,num,opcion,max=0,min=9999;
        double prom=0;
        System.out.println("¿ While (1) ó Do...While (2) ? Cualquier otra tecla termina la ejecución");
        opcion=leer.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("While");
                System.out.print("Ingrese cantidad de números: ");
                n=leer.nextInt();
                while (i<n) {
                    System.out.print("Ingrese número: ");
                    num=leer.nextInt();
                    prom=prom+num;
                    if (max<num){
                        max=num;
                    } 
                    if (min>num){
                        min=num;
                    }
                    // System.out.println("i: " + i);
                    i++;
                    // System.out.println("prom: " + prom + "i: " + i);
                }
                prom=prom/n;
                System.out.println("Máximo: " + max + " - Mínimo: " + min + " - Promedio: " + prom);
                break;
            case 2:
                System.out.println("Do...While");
                System.out.print("Ingrese cantidad de números: ");
                n=leer.nextInt();
                do {
                    System.out.print("Ingrese número: ");
                    num=leer.nextInt();
                    prom=prom+num;
                    if (max<num){
                        max=num;
                    } 
                    if (min>num){
                        min=num;
                    }
                    // System.out.println("i: " + i);
                    i++;
                    // System.out.println("prom: " + prom + "i: " + i);
                } while (i<n);
                prom=prom/n;
                System.out.println("Máximo: " + max + " - Mínimo: " + min + " - Promedio: " + prom);
                break;
            default:
                break;
        }       
    }
}
