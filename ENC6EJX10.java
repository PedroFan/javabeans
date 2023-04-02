/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggenjava;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author Josefina
 */
public class ENC6EJX10 {
    public static byte e6ex10 () {
        Scanner leer = new Scanner(System.in);
        double num1,num2,resultado;
        int i=0, intento=0;
        num1=Math.random()*10;
        num2=Math.random()*10;
        resultado=num1*num2;
        System.out.println("Se generaron dos números aleatorios entre 0 y 10.");
        //System.out.println((int) num1 + " * " + (int) num2 + " = " + (int) resultado);
        System.out.println("");
        System.out.println("Adiviná el producto de multiplicar ambos:");
        do {
            intento=leer.nextInt();
            if (intento==(int)resultado) {
                System.out.println("¡Adivinaste!");
                return 27;
            } else {
                System.out.print("No adivinaste. ¿Querés volver a intentarlo? (S/N)");
                i++;
                if (leer.next().equals("n")) {
                    System.out.println("Intentos: " + i);
                    return 27;
                }
            }
            System.out.println("");
            System.out.println("Adiviná el producto de multiplicar ambos:");
        } while (intento!=(int)resultado);
        System.out.println("Intentos: " + i);
        return 27;
    }
}
