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
public class ENC6EJ7 {
    public static void e6e7 () {
        //&&&&& FDE;
        //X???O correcta;
        
        Scanner leer = new Scanner(System.in);
        String FDE = "&&&&&", secuencia="";
        int i=0,j=-1;
        do {
            System.out.print("Ingrese secuencia: ");
            secuencia=leer.next();
            if ( (secuencia.length()==5) && (secuencia.substring(0,1).equalsIgnoreCase("X")) && (secuencia.substring(4).equalsIgnoreCase("O")) ){
                i++;
            } else {
                j++;
            }
        } while (!secuencia.equals(FDE));
        System.out.print("Correctas: " + i + "Incorrectas: " + j);
    }
}
