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
public class ENC4EJ0A {

    /**
     * @param args the command line arguments
     */
    public static void e4e0a() {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        boolean num1mayor25;
        
        System.out.print("Ingrese el primer número entero: ");
        num1=leer.nextInt();
        System.out.print("Ingrese el segundo número entero: ");
        num2=leer.nextInt();
        
        if (num1>25||num2>25){
            System.out.println("uno o ambos números superan 25");
            num1mayor25=true;
        } else {
            System.out.println("ningún número supera 25");
        }
    }
}
