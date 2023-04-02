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
public class ENC5EJ0F {
    public static void e5e0f (){
    Scanner leer = new Scanner(System.in);
    byte i,j,num;
    for (i=0;i<4;i++){
    do {
        System.out.print("Ingrese número: ");
        num=leer.nextByte();
        //if (num>=1&&num<=20){
    }while (num<1||num>20);
        System.out.print(num + " ");
        for (j=0;j<num;j++){
            System.out.print("*");
        }
    System.out.println(" ");
    }
}
}
