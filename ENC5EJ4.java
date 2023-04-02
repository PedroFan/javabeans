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
public class ENC5EJ4 {
    public static void e5e4(){
    String frase;
    System.out.println("Ingrese una frase");
    Scanner leer = new Scanner(System.in);
    frase = leer.next();
    //String vocal;
    //vocal = frase.substring(0,1);        
    
    if (frase.substring(0,1).equalsIgnoreCase("a")){ 
    System.out.println("CORRECTO");
  
    } else {
   
       System.out.println("INCORRECTO"); 

    }
    }
}
