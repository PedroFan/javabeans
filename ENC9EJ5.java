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
public class ENC9EJ5 {
    public static byte e9e5 () {
        int tam = 3, f=0, c=0, num=0;
        int [][] matriz = new int [tam][tam];
        Scanner leer = new Scanner(System.in);
        
        boolean anti=false;
        for (f=0;f<tam;f++) {
            for (c=0;c<tam;c++) {
                System.out.println("Ingrese número: ");
                num=leer.nextInt();
                matriz[f][c]=num;
                //matriz[f][c]=(int)(Math.random()*10);
            }
        }
        for (f=0;f<tam;f++) {
            for (c=0;c<tam;c++) {
                if (matriz[f][c]<0) {
                    System.out.print(" " + matriz[f][c]);    
                } else {
                    System.out.print("  " + matriz[f][c]);    
                }
                
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        for (f=0;f<tam;f++) {
            for (c=0;c<tam;c++) {
                if (matriz[c][f]<0) {
                    System.out.print(" " + matriz[c][f]);    
                } else {
                    System.out.print("  " + matriz[c][f]);    
                }
                if (matriz[c][f]==matriz[f][c]*-1) {
                    anti=true;
                } else {
                    anti=false;
                }
            }
            System.out.println("");
        }
        if (anti) {
            System.out.println("Es antisimétrica.");
        }
    return 44;}
    
}
