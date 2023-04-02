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
public class ENC5EJ6 {
    public static void e5e6(){
        Scanner leer = new Scanner(System.in);
        String respuesta = "";
        int opcion;
    	double resultado=0,num1,num2;
        System.out.println("Ingrese dos numeros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
    	        
    do {
    	
        System.out.println("Ingrese una opción");

    	opcion = leer.nextInt();
        switch (opcion) {
        	case 1:
           System.out.println("Sumar");
           resultado = num1 + num2;
           //System.out.println("Resultado es: " + resultado);
           break;

        	case 2:
           System.out.println("Resta");
           resultado = num1 - num2;
           //System.out.println("Resultado es: " + resultado);
           break;
            
        	case 3:
           System.out.println("Multiplicar");
           resultado = num1 * num2;
           //System.out.println("Resultado es: " + resultado);
           break;

        	case 4:
           System.out.println("División");
           System.out.println((double)num1/num2);
           //System.out.println("Resultado es: " + resultado);
            break;
            
                case 5:
            System.out.println("Está seguro de que desea salir del programa (s/n)");
            respuesta = leer.next();
            break;
            
        	default:
           System.out.println("");
    	}
        System.out.print("Resultado es: " + (double)resultado);      
    } while (!respuesta.equalsIgnoreCase("s"));
    }
}
  