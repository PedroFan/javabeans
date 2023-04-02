/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggenjava;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Josefina
 */
public class ENC2EJ3 {

    /**
     * @param args the command line arguments
     */
     public static void e2e3() {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese una frase:");
        nombre = leer.nextLine();
        System.out.println(nombre.toUpperCase());
        System.out.println(nombre.toLowerCase());
    }
    
}
