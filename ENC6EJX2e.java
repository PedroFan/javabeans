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
public class ENC6EJX2e {
    public static void e6ex2e (){
        int A=1,B=2,C=3,D=4,aux=0;
        System.out.println("A: " + A + "  B: " + B + "  C: " + C + "  D: " + D);
        aux=B;
        B=C;
        C=A;
        A=D;
        D=aux;
        System.out.print("A: " + A + "  B: " + B + "  C: " + C + "  D: " + D);
    }
}
