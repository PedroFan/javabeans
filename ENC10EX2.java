/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggenjava;

import java.util.Scanner;

/**
 * Escriba un programa que averigüe si dos vectores de N enteros son iguales 
 * (la comparación deberá detenerse en cuanto se detecte alguna diferencia 
 * entre los elementos).
 * @author Josefina
 */
public class ENC10EX2 {
    public static byte e10ex2 () {
        int tam, sum=0, i;

//declaro un semaforo
        
        boolean iguales=false;

// pido tamaño de vector al usuario        
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese tamaño del vector: ");
        tam=leer.nextInt();
        
//declaro vectores
        
        int [] vectoruno = new int [tam];
        int [] vectordos = new int [tam];
        
//relleno los vectores

        for (i=0;i<tam;i++) {
//            vectoruno[i]=(int) Math.random();
            System.out.print("Ingrese valor para posición " + i + " del vector UNO:");
            vectoruno[i]=leer.nextInt();
//            vectordos[i]=(int) Math.random();
            System.out.print("Ingrese valor para posición " + i + " del vector DOS:");
            vectordos[i]=leer.nextInt();
        }

//comparo valor v1 y valor v2 para cada posicion y defino el semaforo como falso si son distintos y salgo del bucle
        
        for (i=0;i<tam;i++) {
            if (vectoruno[i]==vectordos[i]) {
                iguales=true;
            } else {
                iguales=false;
                break;
            }
        }

//uso el semaforo para imprimir si son o no iguales
        
        if (iguales) {
            System.out.println("");
            System.out.println("Los vectores contienen idénticos elementos.");
        } else {
            System.out.println("");
            System.out.println("Los vectores NO contienen idénticos elementos.");
        }
    return 47;}
}
