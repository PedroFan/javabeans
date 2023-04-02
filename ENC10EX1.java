/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggenjava;

import java.util.Scanner;

/**Realizar un algoritmo que calcule la suma de todos los elementos de un vector 
 * de tamaño N, con los valores ingresados por el usuario.

 *
 * @author Josefina
 */
public class ENC10EX1 {
    public static byte e10ex1 () {
        int tam, sum=0, i;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese tamaño del vector: ");
        tam=leer.nextInt();
        int [] vector = new int [tam];
        for (i=0;i<tam;i++) {
            System.out.print("Ingrese elemento [" + i + "] del vector: ");
            vector[i]=leer.nextInt();
            sum=sum+vector[i];
        }
        System.out.println("");
        System.out.println("Suma de los elementos en el vector: " + sum);
    return 46;}
}
