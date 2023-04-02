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
public class ENC6EJ8 {
    public static void e6e8(){
        int n=4,f,c;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un número:");
        n=leer.nextInt();
        for (f=0;f<n;f++){
            for (c=0;c<n;c++){
                if ( f == 0 || f == n-1 || c ==0 || c == n-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                
            }
            System.out.println("");
        }
        
    }
}
