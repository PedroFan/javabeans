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
public class ENC5EJ2 {
    public static void e5e2(){
        Scanner leer = new Scanner(System.in);
        String cadena;
                
        System.out.print("Ingrese una frase: ");
        cadena = leer.nextLine();
        if (cadena.equalsIgnoreCase("eureka")){
            System.out.print("Correcto.");
        } else {
            System.out.print("Incorrecto.");
        }
    }
}
