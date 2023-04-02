/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggenjava;

/**
 *
 * @author Josefina
 */
public class ENC5EJ8 {
    public static void e5e8 () {
        int n=4,o,i,j;
        for (i=0;i<n;i++){
            for (j=0;j<n;j++){
                o=i*n+j;
                //System.out.print(o);
                if (o<n+1||(o>n+2&&o<n*2)||(o>10&&o<16)){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
