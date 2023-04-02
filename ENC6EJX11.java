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
public class ENC6EJX11 {
    public static byte e6ex11 () {
        int i=0,num;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese número: ");
        System.out.println("");
        num=leer.nextInt();
        
        while (num%10>=0&&num!=0) {
        num=num/10;
        i++;
        }
        System.out.println("Dígitos: " + i);
        return 28;
    }
}
