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
public class ENC6EJX4e {
    public static void e6ex4e () {
        // 1=I 5=V 10=X
        Scanner leer = new Scanner(System.in);
        byte num,i;
        String rom="";
        System.out.print("Ingrese un número entre 1 y 10: ");
        num=leer.nextByte();
        if (num>8) {
            if (num==10) {
                rom="X";
            } else { rom="IX";}
        } else if (num>3){
            if (num==4){
                rom="IV";
            } else {
                rom="V";
                for (i=0;i<num%5;i++) {
                   rom=rom.concat("I");
                }
            }
        } else {
            for (i=0;i<num;i++) {
                   rom=rom.concat("I");
                }
        }
        System.out.println("Romano: " + rom);
    }
}
