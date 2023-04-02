/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggenjava;
import java.util.Scanner;

/**
 *
 * @author Manuel Dominich
 */
public class ENC2EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void e2e1() {
  	Scanner leer = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        
        System.out.println("Introduce el primer numero");
        num1 = leer.nextInt();
        System.out.println("Introduce el segundo numero");
        num2 = leer.nextInt();
        System.out.println("Resultado = " + (num1 + num2));
  } 
}
