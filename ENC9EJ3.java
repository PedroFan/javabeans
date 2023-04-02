/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggenjava;

import java.util.Scanner;

/**Recorrer un vector de N enteros contabilizando cuántos números 
 * son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 *
 * @author Josefina
 */
public class ENC9EJ3 {
    public static byte e9e3 () {
        int num=0,i=0,tam=0,j=0;
        Scanner leer = new Scanner(System.in);
        System.out.print("Tamaño del vector: ");
        tam=leer.nextInt();
        int [] digitos = new int [6];
        int [] vector = new int [tam];
        for (i=0;i<tam;i++){
            vector[i]=(int)(Math.random() * 10);
            num=vector[i];
            System.out.println(num);
            // acá calculamos cantidad de dígitos (j)
            j=0;
            while ( num % 10 >= 0 && num != 0) {
            num=num/10;
            //System.out.println(num);
            j++;
            //System.out.println(j);            
            }
            // acá incrementamos en uno el valor contenido en digitos j-1 
            // digitos [0] = 3 de 1 dígito [1] = 2 de 2 dígitos [2] [3] [4]
            //if (j>0){
                digitos[j]++;
            //}
            //System.out.println("Dígitos: " + j);
            }
        for (i=0;i<6;i++){
            System.out.println("Cantidad de números de " + (i) + "dígitos: " + digitos[i]);
            }
        return 42;}
}
