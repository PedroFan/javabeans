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
public class ENC7EJX4 {
    public static void e7ex4 () {
        // 1=I 5=V 10=X
        Scanner leer = new Scanner(System.in);
        int num,orig,i=0,j,k;
        String rom="";
        System.out.print("Ingrese un número entre 1 y 10: ");
        num=leer.nextInt();
        orig=num;
        while (orig%10>=0&&orig!=0) {
        orig=orig/10;
        i++;
        }
        System.out.println(i);
        for (j=i-1;j>0;j--) {
            switch (num-(10^j)) {
                case 9:
                    break;
                case 2:
                    if (num-(10^j)>3) {
                        
                    }
                    for (k=0;k<num-(10^j);k++) {
                        
                        System.out.print("C");}
                    break;
                case 1:
                    for (k=0;k<num-(10^j);k++) {
                    System.out.print("M");}
                    break;            
                default:
                    for (k=0;k<num-(10^j);k++) {
                    if (k>3) {
                        
                    }
                        switch (j) {
                        case 3:
                            System.out.print("M");
                        case 2:
                            break;
                        }
                    }
                }
            }
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
