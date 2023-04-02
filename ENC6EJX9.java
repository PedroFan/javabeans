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
public class ENC6EJX9 {
    public static void e6ex9 () {
        int dividendo, divisor, i=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Encuentro 6 - Ejercicio Extra 9");
        System.out.println("--------- - - --------- ----- -");
        System.out.println("");
        System.out.println("Simular la división mediante el uso de restas.");
        System.out.println("------- -- -------- -------- -- --- -- -------");
        System.out.println("");
        System.out.println("NUM1 > 1 && NUM2 > 1 ");
        System.out.println("Calcular cociente y residuo usando sólo restas.");
        System.out.println("Restar el dividendo del divisor hasta obtener un");
        System.out.println("resultado menor que el divisor, este es el residuo");
        System.out.println("y el número de restas el cociente.");
        System.out.println("");
        System.out.println("Ingrese el primer número entero mayor que uno:");
        dividendo=leer.nextInt();
        System.out.println("Ingrese el segundo número entero mayor que uno:");
        divisor=leer.nextInt();
        do {
            dividendo=dividendo-divisor;
            i++;
        } while (dividendo>=divisor);
        System.out.println("Resto: " + dividendo + " - Cociente: " + i);       
        }
    }
