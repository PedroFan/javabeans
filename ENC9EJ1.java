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
public class ENC9EJ1 {
    public static byte e9e1 () {
        /*Realizar un algoritmo que llene un vector con los 100 primeros números enteros y los muestre por pantalla en orden descendente.*/
      
    int[] equipo = new int[100];
    
      for (int i = 0; i < 100; i++) {
            equipo[i] = i+1;
        }
    for (int i = 99; i >= 0; i--) {
            System.out.println(equipo[i]);
        }
    return 40;}
}
