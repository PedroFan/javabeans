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
public class ENC5EJ7 {
    public static void e5e7 (){
    int i = 0,j = 0;
    Scanner leer = new Scanner(System.in);
    String FDE="&&&&&";
    String secuencia;
    do {
        System.out.print("Ingrese secuencia: ");
        secuencia=leer.next();
        if (secuencia.length()==5&&secuencia.substring(0, 1).equals("X")&&secuencia.substring(4,5).equals("O")){
            i++;
        } else if (secuencia.equals("&&&&&")) {
        } else {
            j++; 
        }
    }
    while (!secuencia.equals(FDE));
    System.out.print("Correctas: " + i + " - Incorrectas: " + j);
}
}

