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
public class ENC9EJ6 {
    public static byte e9e6 () {
        int tam = 3, f=0, c=0, sum=0;
        int [][] matriz = new int [tam][tam];
        int [] suma = new int [3];
        Scanner leer = new Scanner(System.in);
        boolean anti=false;
        for (f=0;f<tam;f++) {
            for (c=0;c<tam;c++) {
                System.out.println("Ingrese número: ");
                matriz[f][c]=leer.nextInt();
                //sum=sum+matriz[f][c];
                suma[f]=suma[f]+matriz[f][c];
                suma[c+tam]=suma[c+tam]+matriz[f][c];
                if (f==c) {
                    if (f==1) {
                        suma[7]=suma[7]+matriz[f][c];
                        suma[6]=suma[6]+matriz[f][c];
                    } else {
                    suma[6]=suma[6]+matriz[f][c];
                    } 
                } else if (f==0&&c==2||f==2&&c==0)
                    suma[7]=suma[7]+matriz[f][c];
            }
                //matriz[f][c]=(int)(Math.random()*10);
        }
        //suma[f]=suma[f]+sum;
        //sum=0;
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
        for (f=0;f<8;f++) {
            sum=sum+suma[f];
            System.out.print(" " + suma[f]);    
        }        
            System.out.println("");
        if (sum/8==suma[0]) {
            System.out.println("Es mágica.");
        } else {
            System.out.println("NO es mágica.");
        }
    return 45;}
}
