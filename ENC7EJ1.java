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
public class ENC7EJ1 {
    public static byte e7e1 (){
        Scanner leer = new Scanner(System.in);
        String respuesta = "";
        int opcion;
    	double resultado=0,num1,num2;
        System.out.println("Ingrese dos numeros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
    	        
    do {
    	System.out.println("");
        System.out.println("Ingrese una opción:");  
        System.out.println("1) sumar");
        System.out.println("2) restar");
        System.out.println("3) multiplicar");
        System.out.println("4) Dividir");
        System.out.println("5) Salir");
        

    	opcion = leer.nextInt();
        switch (opcion) {
        	case 1:
                    System.out.println("Resultado: " + sumar(num1,num2));
                    //resultado = num1 + num2;
                    //System.out.println("Resultado es: " + resultado);
                    break;

        	case 2:
                    System.out.println("Resultado: " + restar(num1,num2));
                    //System.out.println("Resta");
                    //resultado = num1 - num2;
                    //System.out.println("Resultado es: " + resultado);
                    break;
            
        	case 3:
                    
                    System.out.println("Resultado: " + multiplicar(num1,num2));
                    //resultado = num1 * num2;
                    //System.out.println("Resultado es: " + resultado);
                    break;

        	case 4:
                    System.out.println("Resultado: " + dividir(num1,num2));
                    //System.out.println((double)num1/num2);
                    //System.out.println("Resultado es: " + resultado);
                    break;
            
                case 5:
                    System.out.println("Está seguro de que desea salir del programa (s/n)");
                    respuesta = leer.next();
                    break;
            
        	default:
           System.out.println("");
    	}
    //    System.out.print("Resultado es: " + (double)resultado);      
    } while (!respuesta.equalsIgnoreCase("s"));
    return 34;
    }
   
    public static double sumar (double num1, double num2) {
        double resultado=num1+num2;
        return resultado;}
       
    public static double restar (double num1, double num2) {
        double resultado=num1-num2;
        return resultado;}
        
    public static double multiplicar (double num1, double num2) {
        double resultado=num1*num2;
        return resultado;}
        
    public static double dividir (double num1, double num2) {
        double resultado=num1/num2;
        return resultado;}
}


