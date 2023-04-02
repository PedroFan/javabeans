/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggenjava;

import java.util.Scanner;

/**
 * Obra Social
 * @author Josefina
 */
public class ENC6EJX5 {
    public static void e6ex5 () {
        Scanner leer=new Scanner(System.in);
        String letra="";
        double valor=0;
        System.out.print("Ingrese categoría (A,B o C): ");
        letra=leer.next();
        System.out.println("");
        System.out.print("Ingrese valor del tratamiento: ");
        valor=leer.nextDouble();
        System.out.println("");
        if (letra.equalsIgnoreCase("A")){
            System.out.print("El costo para el socio es: " + valor*0.50);
        } else if (letra.equalsIgnoreCase("B")){
            System.out.print("El costo para el socio es: " + valor*0.65);
        } else if (letra.equalsIgnoreCase("C")){
            System.out.print("El costo para el socio es: " + valor);
        } else {
            System.out.print("No es una categoría válida.");
        }
    }
}