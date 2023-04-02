/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggenjava;

import java.util.Scanner;

/**
 * Los profesores del curso de programación de Egg necesitan llevar un registro 
 * de las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de
 * aprobados y desaprobados. Durante el período de cursado cada alumno obtiene 4
 * notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las 
 * ponderaciones de cada nota son:
 * Primer trabajo práctico evaluativo 10%
 * Segundo trabajo práctico evaluativo 15%
 * Primer Integrador 25%
 * Segundo integrador 50%
 * Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo.
 * Al final del programa los profesores necesitan obtener por pantalla la
 * cantidad de aprobados y desaprobados, teniendo en cuenta que solo aprueban
 * los alumnos con promedio mayor o igual al 7 de sus notas del curso.
 *
 * @author Josefina
 */
public class ENC10EX4 {
    public static byte e10ex4 () {
        int tam, notas=5,desaprobados;
        //boolean iguales=false;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese tamaño del vector: ");
        tam=leer.nextInt();
        double [][] matriz = new double [tam][notas];
        System.out.println("");
        System.out.println("Invoco 'rellenaMatriz(matriz)'");
        System.out.println("");
        desaprobados=tam-rellenaMatriz(matriz,tam,notas);
        System.out.println("");
        System.out.println("Invoco 'muestraMatriz(matriz)' : ");
        System.out.println("");
        muestraMatriz(matriz,tam,notas);
        System.out.println("");
        System.out.println("Aprobados: " + (10-desaprobados) + " - Desaprobados: " + desaprobados);
    return 49;}

    public static int rellenaMatriz (double [] [] matriz, int tam, int notas) {
        int i,j,aprobados=0;
        double sum=0;
        for (i=0;i<tam;i++) {
            sum=0;
            for (j=0;j<notas;j++) {
                matriz[i][j]=(int)(Math.random()*10);
                //System.out.print("Ingrese nota " + (j+1) + ": ");
                //matriz[i][j]=new Scanner(System.in).nextInt();
                switch(j) {
                    case 0:
                        sum=sum+(matriz[i][j]*0.1);
                        break;
                    case 1:
                        sum=sum+(matriz[i][j]*0.15);
                        break;
                    case 2:
                        sum=sum+(matriz[i][j]*0.25);
                        break;
                    case 3:
                        sum=sum+(matriz[i][j]*0.50);
                        break;
                    case 4:
                        matriz[i][j]=sum;
                    default:
                    }
                } 
            if (sum>=7) {
                System.out.println("Alumno " + (i+1) + " aprobado!");
                aprobados++;
            }
        }
    return aprobados;}
    
    public static void muestraMatriz (double [] [] matriz, int tam, int notas) {
        int i,j;
        System.out.println("");
        for (i=0;i<tam;i++) {
            for (j=0;j<notas;j++) {
                System.out.print(" [" + matriz[i][j] + "] ");
            }
            System.out.println("");
        }
    }

}