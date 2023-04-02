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
public class ENC9EJ13 {
    public static byte e9e13 () {
        Scanner leer = new Scanner(System.in);

        System.out.println("Cuántos nombres?");
        int cuantos = leer.nextInt();
        
        
        String[] equipo = new String[cuantos];

        for (int i = 0; i < cuantos; i++) {
            System.out.println("Ingrese nombre: ");
            equipo[i] = leer.next();
        }
        
        System.out.println("********************");
        
        for (int i = 0; i < cuantos; i++) {
            System.out.println(equipo[i]);
        }
    return 39;}
}

