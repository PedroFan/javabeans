/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggenjava;

/**
 *
 * @author Josefina
 */
public class ENC9EJ4 {
    public static byte e9e4 () {
        int tam = 4, f=0, c=0;
        int [][] matriz = new int [tam][tam];
        for (f=0;f<tam;f++) {
            for (c=0;c<tam;c++) {
                matriz[f][c]=(int)(Math.random()*10);
            }
        }
        for (f=0;f<tam;f++) {
            for (c=0;c<tam;c++) {
                System.out.print(" " + matriz[f][c]);    
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        for (f=0;f<tam;f++) {
            for (c=0;c<tam;c++) {
                System.out.print(" " + matriz[c][f]);    
            }
            System.out.println("");
        }
    return 43;}
    
}
