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
public class ENC5EJ5 {
    public static void e5e5(){
    int limite, num, suma = 0; 

System.out.println("Ingrese un limite");
Scanner leer = new Scanner(System.in);
limite = leer.nextInt();
        
Scanner lee = new Scanner(System.in);
    do {
        System.out.println("Ingrese un numero");
        num = lee.nextInt();
        suma += num;
        System.out.println("Suma= " + suma);
} while (suma <= limite);
        
System.out.println("Suma llego al limite");        
        
    }
    
}
