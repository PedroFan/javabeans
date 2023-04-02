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
public class ENC6EJX3 {
    public static void e6ex3 () {
        Scanner leer = new Scanner(System.in);
        String letra;
        System.out.print("Ingrese una letra: ");
        letra=leer.next();
        if (letra.equalsIgnoreCase("a")||letra.equalsIgnoreCase("e")||letra.equalsIgnoreCase("i")||letra.equalsIgnoreCase("o")||letra.equalsIgnoreCase("u")) {
        } else {
            System.out.println("No es una vocal.");
        }
    }
}
