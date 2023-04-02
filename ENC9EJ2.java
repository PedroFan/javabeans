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
public class ENC9EJ2 {
    public static byte e9e2 () {
        Scanner Leer=new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
       int x=Leer.nextInt();
        int[] vector=new int[x];
        
        for (int i=0; i<x; i++){
            vector[i]= (int)(Math.random() * 10);
        }
         System.out.println("---------------------------------------");
        System.out.println("Ingresa un numero a buscar");
         
        int num=Leer.nextInt();
        int cont=0;
          for (int i=0; i<x; i++){
              if (num==vector[i]){
                  System.out.println("El numero ingresado esta en la posicion:" + i);
                 cont++; 
              } 
          }       
        System.out.println("---------------------------------------");
        if (cont==0){
            System.out.println("No se encontro el numero ingresado");
        } else if (cont>1){
            System.out.println("El numero ingresado se repitio " + cont + " veces");
        }
    return 41;}
}
