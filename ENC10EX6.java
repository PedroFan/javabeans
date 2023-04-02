/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggenjava;

import java.util.Scanner;

/*
* Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a
* medida que el usuario las va ingresando, construya una “sopa de letras para
* niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en
* orden horizontal en una fila que será seleccionada de manera aleatoria. Una
* vez concluida la ubicación de las palabras, rellene los espacios no utilizados
* con un número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de
* letras creada.
* Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las 
* siguientes funciones de Java substring(), Length() y Math.random().
*
* @author Josefina
*/

public class ENC10EX6 {
    public static byte e10ex6 () {
        int taN, taM,palabras;
        //boolean iguales=false;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese tamaño N de la matriz: ");
        taN=leer.nextInt();
        System.out.print("Ingrese tamaño M de la matriz: ");
        taM=leer.nextInt();
        char [][] matriz = new char [taN][taM];
        System.out.println("");
        System.out.println("Invoco 'rellenaMatriz(matriz)'");
        System.out.println("");
        rellenaMatriz(matriz,taN,taM);
        System.out.println("");
        do {
            System.out.print("¿Cuántas palabras ingresa?");
            palabras=leer.nextInt();
        } while (palabras<0||palabras>19);
        System.out.println("Pido " + palabras + " palabras de entre 3 y 5 caracteres");
        System.out.println("");
        pidoPalabras(matriz,taN,taM,palabras);
        System.out.println("");
        System.out.println("Invoco 'muestraMatriz(matriz)' : ");
        System.out.println("");
        muestraMatriz(matriz,taN,taM);
    return 52;}

    public static void rellenaMatriz (char [] [] matriz, int taN, int taM) {
        int i,j;
        for (i=0;i<taN;i++) {
            for (j=0;j<taM;j++) {
                int aleatorio=(int)(Math.random()*10);
                matriz[i][j]=(char) (aleatorio+48);
                System.out.print(" [" + matriz[i][j] + "] ");
            }
            System.out.println("");
        }
    }
    
    public static void pidoPalabras (char [] [] matriz, int taN, int taM,int palabras) {
        int i,j,k,l,m;
        boolean repite=false;
        String palabra;
        int [] vector = new int [palabras];
        for (i=0;i<palabras;i++) {
            vector[i]=20;
        }
        for (i=0;i<palabras;i++) {
            do {
            System.out.print("Ingrese palabra " + (i+1) + ": ");
            palabra=new Scanner(System.in).next();
            } while (palabra.length()<3||palabra.length()>5);
            System.out.println("");
            do {
                k=(int)(Math.random()*taN);
                vector[i]=k;
                for (m=0;m<i;m++){
                    if (k==vector[m]){
                        repite=true;
                        System.out.println("repite" + k);
                        break;
                    } else {
                        vector[i]=k;
                        repite=false;
                    }
                }
            } while (repite==true);
            System.out.print("k: " + k + " - ");
            do {
                l=(int)(Math.random()*taM);
                System.out.print("l: " + l + " - ");
            } while ((l + palabra.length()) > taM );
            for (j=0;j<palabra.length();j++) {
                matriz[k][l]=palabra.charAt(j);
                System.out.print(matriz[k][l]);
                l++;
            }
            System.out.println("");
        }
        for (i=0;i<palabras;i++) {
            System.out.print(" [" + vector[i] + "] ");
        }
    }
    
    public static void muestraMatriz (char [] [] matriz, int taN, int taM) {
        int i,j;
        System.out.println("");
        for (i=0;i<taN;i++) {
            for (j=0;j<taM;j++) {
                System.out.print(" [" + matriz[i][j] + "] ");
//                sum=sum+matriz[i][j];
            }
            System.out.println("");
        }
//    return sum;}

//    public static void ponePalabra(int [] [] matriz, int k, int l, String palabra) {
        
    }
}

