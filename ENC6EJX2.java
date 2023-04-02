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
public class ENC6EJX2 {
    public static void e6ex2 () {
        int j,aux,A=1,B=2,C=3,D=4;
        for (j=0;j<2;j++){
        //for (i=0;i<4;i++){
            System.out.println(A + " " + B + " " + C + " " + D);
        aux=B;
        B=C;
        C=D;
        D=aux;
        aux=C;
        C=A;
        A=aux;}
    //}
}
}