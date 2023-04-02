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
public class ENC5EJ1 {
    
    public static void e5e1() {
        
        Scanner leer = new Scanner(System.in);
        int num;
        //boolean espar;
        
        System.out.print("Ingrese un número: ");
        num = leer.nextInt();
        
        if (num%2==0){
            //espar=true;
            System.out.println("Es par.");
        } else {
            System.out.println("Es impar");
        }
    }
}
