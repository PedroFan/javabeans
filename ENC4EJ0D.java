/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggenjava;

/**
 *
 * @author Josefina
 */
import java.util.Scanner;

/**
 *
 * @author Josefina
 */
public class ENC4EJ0D {

    public static void e4e0d () {
        Scanner leer = new Scanner(System.in);        
        short nota;
        do {
            System.out.print("Ingrese nota entre 0 y 10: ");
            nota=leer.nextShort();
        }
        while (nota<0||nota>10);
    }
}