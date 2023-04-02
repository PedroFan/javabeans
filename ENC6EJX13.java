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
public class ENC6EJX13 {
    public static byte e6ex13 () {
        Scanner leer = new Scanner(System.in);
        int h,f,c;
        System.out.print("Ingrese altura de escalera de números: ");
        h=leer.nextInt();
        for (f=0;f<h;f++) {
            for (c=1;c<=f+1;c++) {
                System.out.print(c);
            }
            System.out.println("");
        }
        return 30;
    }
}
