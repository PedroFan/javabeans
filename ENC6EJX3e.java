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
public class ENC6EJX3e {
    public static void e6ex3e () {
        char letra='z';
        Scanner leer = new Scanner(System.in);
        do {
            System.out.print("Ingrese una letra: (z - Salir)");
            letra=leer.next().charAt(0);
            letra=Character.toLowerCase(letra);
            if (letra=='a' || letra=='e' || letra=='i' || letra=='o' || letra=='u') {
            }
            else { 
                System.out.println("No es una vocal.");   
            }
        }while (letra!='z');
}
}