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
public class ENC6EJX4 {
    public static void e6ex4 (){
        Scanner leer = new Scanner(System.in);
        int num,i=0;
        System.out.print("Ingrese un número: ");
        num=leer.nextInt();
        String rom="";
        if (num>8&&num<11){
            if (num==10){
                rom="X";
            } else {
                rom="IX";
            }
        } else if (num>3&&num<9) {
            if (num==4){
                rom=("IV");
            } else if(num%5>0){
                rom=("V");
                for (i=0;i<num%5;i++){
                    rom=rom.concat("I");}
            } else {
                rom=("V");
            }
        } else {
            for (i=0;i<num;i++){
                    rom=rom.concat("I");
            }
        }
        System.out.print(rom);
    }    
}

