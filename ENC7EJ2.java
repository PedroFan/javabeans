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
public class ENC7EJ2 {
    public static byte e7e2 () {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de personas: ");
        int N = leer.nextInt();
        for (int i=0; i<N; i++) {
            if (datos(i)){
                System.out.print("La persona es MAYOR de edad");
            }
            else{
                System.out.print("La persona es MENOR de edad");
            }
            System.out.println("");
            System.out.print("Desea mostrar la siguiente persona?: ");
            String resp = leer.next();
            if (resp.equalsIgnoreCase("No"))
                break;}
        return 35;
        }
        
    public static boolean datos(int i){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la persona "+(i+1)+": ");
        String nombre = leer.next();
        System.out.print("Ingrese la edad de la persona "+(i+1)+": ");
        int edad = leer.nextInt();
        System.out.println("---------DATOS:---------");
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        return edad>=18;
    }
}
