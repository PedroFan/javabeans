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
public class EggEnJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte i=0, opcion=0, j;
        int mapa[];
        mapa = new int[50];
        for (j=0;j<50;j++) {
            mapa[j]=0;
        }
        j=0;
        Scanner leer = new Scanner(System.in);
        String pausa="c";
        do {
            LISTADO.listado(i);
            System.out.print("Ingrese una opción: ");
            opcion = leer.nextByte();
            System.out.println("");
            switch(opcion){
                case 0:
                    LISTADO.listado(i);
                    i++;
                    break;
                case 1:
                    ENC2EJ1.e2e1();
                    break;
                case 2:
                   ENC2EJ2.e2e2();
                   break;
                case 3:
                    ENC2EJ3.e2e3();
                    break;
                case 4:
                    ENC4EJ0A.e4e0a();
                    break;
                case 5:
                    ENC4EJ0B.e4e0b();
                    break;
                case 6:
                    ENC4EJ0C.e4e0c();
                    break;
                case 7:
                    ENC4EJ0D.e4e0d();
                    break;
                case 8:
                    ENC4EJ0E.e4e0e();
                    break;
                case 9:
                    ENC5EJ0F.e5e0f();
                    break;
                case 10:
                    ENC5EJ1.e5e1();
                    break;
                case 11:
                    ENC5EJ2.e5e2();
                    break;
                case 12:
                    ENC5EJ3.e5e3();
                    break;
                case 13:
                    ENC5EJ4.e5e4();
                    break;
                case 14:
                    ENC5EJ5.e5e5();
                    break;
                case 15:
                    ENC5EJ6.e5e6();
                    break;
                case 16:
                    ENC6EJ7.e6e7();
                    break;
                case 17:
                    ENC6EJ8.e6e8();
                    break;
                case 18:
                    ENC6EJX1e.e6ex1e();
                    break;
                case 19:
                    ENC6EJX2e.e6ex2e();
                    break;
                case 20:
                    ENC6EJX3e.e6ex3e();
                    break;
                case 21:
                    ENC6EJX4e.e6ex4e();
                    break;
                case 22:
                    ENC6EJX5.e6ex5();
                    break;
                case 23:
                    ENC6EJX6.e6ex6();
                    break;
                case 24:
                    ENC6EJX7.e6ex7();
                    break;
                case 25:
                    ENC6EJX8.e6ex8();
                    break;
                case 26:
                    ENC6EJX9.e6ex9();
                    break;
                case 27:
                    mapa[j]=ENC6EJX10.e6ex10();
                    j++;
                    break;
                case 28:
                    mapa[j]=ENC6EJX11.e6ex11();
                    j++;
                    break;
                case 29:
                    mapa[j]=ENC6EJX12.e6ex12();
                    j++;
                    break;
                case 30:
                    mapa[j]=ENC6EJX13.e6ex13();
                    j++;
                    break;
                case 31:
                    mapa[j]=ENC6EJX14.e6ex14();
                    j++;
                    break;
                case 32:
                    mapa[j]=ENC7EJ11.e7e11();
                    j++;
                    break;
                case 33:
                    mapa[j]=ENC7EJ12.e7e12();
                    j++;
                    break;
                case 34:
                    mapa[j]=ENC7EJ1.e7e1();
                    j++;
                    break;
                case 35:
                    mapa[j]=ENC7EJ2.e7e2();
                    j++;
                    break;
                case 36:
                    mapa[j]=ENC7EJ3.e7e3();
                    j++;
                    break;
                case 37:
                    mapa[j]=ENC7EJ4.e7e4();
                    j++;
                    break;
                case 38:
                    ENC7EJX4.e7ex4();
                    j++;
                    break;
                case 39:
                    mapa[j]=ENC9EJ13.e9e13();
                    j++;
                    break;
                case 40:
                    mapa[j]=ENC9EJ1.e9e1();
                    j++;
                    break;
                case 41:
                    mapa[j]=ENC9EJ2.e9e2();
                    j++;
                    break;
                case 42:
                    mapa[j]=ENC9EJ3.e9e3();
                    j++;
                    break;
                case 43:
                    mapa[j]=ENC9EJ4.e9e4();
                    j++;
                    break;
                case 44:
                    mapa[j]=ENC9EJ5.e9e5();
                    j++;
                    break;
                case 45:
                    mapa[j]=ENC9EJ6.e9e6();
                    j++;
                    break;
                case 46:
                    mapa[j]=ENC10EX1.e10ex1();
                    j++;
                    break;
                case 47:
                    mapa[j]=ENC10EX2.e10ex2();
                    j++;
                    break;
                case 48:
                    mapa[j]=ENC10EX3.e10ex3();
                    j++;
                    break;
                case 49:
                    mapa[j]=ENC10EX4.e10ex4();
                    j++;
                    break;
                case 50:
                    mapa[j]=ENC10EX5.e10ex5();
                    j++;
                    break;
                case 51:
                    mapa[j]=ENC10EX3e.e10ex3e();
                    j++;
                    break;
                case 52:
                    mapa[j]=ENC10EX6.e10ex6();
                    j++;
                    break;
                case 53:
                    mapa[j]=ENC11EX7.e11ex7();
                    j++;
                    break;
                default:
                    break;
                }
            if (opcion>0) {
                System.out.println("");
                System.out.println("");
                System.out.print("¿Listo para continuar? (S/N)");
                pausa=leer.next();
            }
        } while (opcion>=0/*&&opcion<338*/&&!pausa.equalsIgnoreCase("N"));
        System.out.println("");
        System.out.println("Se ejecutaron los siguientes ejercicios:");
        for (i=0;i<j;i++) {
            System.out.print(mapa[i] + " - ");
        }
    }
}

    
 
