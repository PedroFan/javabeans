/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggenjava;

import java.util.Scanner;

/*
* Crear una función rellene un vector con números aleatorios, pasándole un 
* arreglo por parámetro. Después haremos otra función o procedimiento que 
* imprima el vector.
* 
* @author Josefina
*/

public class ENC10EX3 {
    public static byte e10ex3 () {
        int tam, sum=0;
        //boolean iguales=false;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese tamaño del vector: ");
        tam=leer.nextInt();
        int [] vector = new int [tam];
        System.out.println("Invoco 'rellenaVector(vector)' : ");
        rellenaVector(vector);
        System.out.println("Invoco 'muestraVector(vector)' : ");
        muestraVector(vector);
    return 48;}

    public static void rellenaVector (int [] vector) {
        int i;
        for (i=0;i<vector.length;i++) {
            vector[i]=(int) (Math.random()*10);
        }
    }
    
    public static void muestraVector (int [] vector) {
        int i;
        for (i=0;i<vector.length;i++) {
            System.out.print(" [" + vector[i] + "] ");
        }
    }

}

