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
public class ENC4EJ0B {

    /**
     * @param args the command line arguments
     */
    public static void e4e0b() {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int tipoMotor;
                     
        System.out.print("Ingrese el tipo de motor: ");
        tipoMotor=leer.nextInt();
        switch (tipoMotor) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("“La bomba es una bomba de hormigón”.");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia.");
                break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba.");
        }
    }
}
