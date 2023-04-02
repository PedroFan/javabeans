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
public class ENC4EJ0E {
    
    public static void e4e0e () {
        Scanner leer = new Scanner(System.in);        
        short i=0;
        int num,sum = 0;
        do {
            System.out.print("Ingrese el " + (i+1) + " número: ");
            i++;
            num=leer.nextInt();
            if (num==0) {
                System.out.println("Se capturó el numero cero");
                break;
            } else if (num>0) {
                sum=sum+num;
            } else {
            }
        }
        while (i<20);
        System.out.println("Suma excluyendo negativos: " + sum);
    }
}