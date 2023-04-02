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
public class ENC6EJX1 {
    public static void e6ex1 () {
        Scanner leer = new Scanner(System.in);
        int min, hora=60, dia=1440;
        System.out.print("Ingrese minutos: ");
        min=leer.nextInt();
        System.out.println(((int)min/dia)*dia);
        System.out.println(((int)(min-((int)min/dia)*dia)/hora)*hora);
        System.out.println((int)min-((int)min/dia)*dia-((int)(min-((int)min/dia)*dia)/hora)*hora);
        System.out.print("Días: " + (int)min/dia + " - Horas: " +  ((int)(min-((int)min/dia)*dia)/hora) + " - Minutos: " + ((int)min-((int)min/dia)*dia-((int)(min-((int)min/dia)*dia)/hora)*hora));
    }
}
