/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggenjava;

import java.util.Scanner;

/**
 * Realizar un programa que llene una matriz de tamaño NxM con valores 
 * aleatorios y muestre la suma de sus elementos.
 * @author Josefina
 */
public class ENC10EX5 {
    public static byte e10ex5 () {
        int taN, taM;
        //boolean iguales=false;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese tamaño N de la matriz: ");
        taN=leer.nextInt();
        System.out.print("Ingrese tamaño M de la matriz: ");
        taM=leer.nextInt();
        int [][] matriz = new int [taN][taM];
        System.out.println("");
        System.out.println("Invoco 'rellenaMatriz(matriz)'");
        System.out.println("");
        rellenaMatriz(matriz,taN,taM);
        System.out.println("");
        System.out.println("Invoco 'muestraMatriz(matriz)' : ");
        System.out.println("");
        System.out.println("Suma de elementos en la matriz: " + muestraMatriz(matriz,taN,taM));
        System.out.println("");
    return 50;}

    public static void rellenaMatriz (int [] [] matriz, int taN, int taM) {
        int i,j;
        for (i=0;i<taN;i++) {
            for (j=0;j<taM;j++) {
                matriz[i][j]=(int)(Math.random()*10);
            } 
        }
    }
    
    public static int muestraMatriz (int [] [] matriz, int taN, int taM) {
        int i,j, sum=0;
        System.out.println("");
        for (i=0;i<taN;i++) {
            for (j=0;j<taM;j++) {
                System.out.print(" [" + matriz[i][j] + "] ");
                sum=sum+matriz[i][j];
            }
            System.out.println("");
        }
    return sum;}
}