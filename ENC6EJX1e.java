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
public class ENC6EJX1e {
    public static void e6ex1e () {
        int dias, horas;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese minutos: ");
        int minutos = leer.nextInt();
        dias = minutos/(24*60);
        minutos = minutos - dias*24*60;
        horas = minutos/60;
        System.out.print("Días: " + dias + " - Horas: " + horas + " - Minutos: " + (minutos=minutos-(horas)*60));
    }
}
