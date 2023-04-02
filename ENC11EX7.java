/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggenjava;

import java.util.Scanner;

/*
* Realizar un programa que complete un vector con los N primeros números de la
* sucesión de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de
* los siguientes números:
* 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
* Donde cada uno de los números se calcula sumando los dos anteriores a él. Por
* ejemplo:
* La sucesión del número 2 se calcula sumando (1+1)
* Análogamente, la sucesión del número 3 es (1+2),
* Y la del 5 es (2+3),
* Y así sucesivamente…
* La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
* Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
* Fibonaccin = 1 para todo n<=1
* Por lo tanto, si queremos calcular el término “n” debemos escribir una función 
* que reciba como parámetro el valor de “n” y que calcule la serie hasta llegar 
* a ese valor.
* Para conocer más acerca de la serie de Fibonacci consultar el siguiente link: 
* https://quantdare.com/numeros-de-fibonacci/
*
* @author Josefina
*/

public class ENC11EX7 {
    public static byte e11ex7 () {
//declaro variable entera tam: tamaño del vector (cantidad de índices o posiciones)
        int tam;
//declaro variables long uno, ant y aux e inicializo uno y ant con 1 para poder largar la sucesión
        long uno=1,ant=1,aux=0;
//defino tam con el valor ingresado por usuario mediante new Scanner        
        System.out.print("Ingrese el tamaño del vector Fibonacci: ");
        tam=new Scanner(System.in).nextInt();
//declaro arreglo unidimensional [] de long fibonacci y dimensiono usando tam
        long [] fibonacci = new long [tam];
//inicializo la primer posición de la sucesión a lo bruto        
        fibonacci[0]=uno;
//imprimo el valor de uno (que todavía no cambió)        
        System.out.print(" " + uno + " ");
//recorro con un for cada posición del vector desde índice [1]
        for (int i = 1; i < tam; i++) {
//imprimo el valor de uno (que todavía no cambió)                    
            System.out.print(" " + uno + " ");
//asigno ANT a AUX            
            aux=ant;
//asigno UNO a ANT                        
            ant=uno;
//acumulo en UNO : UNO + AUX                        
            uno=uno+aux;
//inicializo la posición actual [i] dentro del vector con el valor en UNO
            fibonacci[i]=uno;
        }
        return 53;}
}
