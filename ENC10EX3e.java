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
public class ENC10EX3e {
    public static byte e10ex3e () {
// declaro y defino n = 10
        int n = 10;
// declaro vector
        int [] vector = new int [n];
// invoco rellenoVector(vector,n)        
        System.out.println("invoco 'rellenoVector(vector,n)'");
        rellenoVector(vector,n);
// invoco muestroVector(vector,n)        
        System.out.println("invoco 'muestroVector(vector,n)'");
        muestroVector(vector,n);
    return 51;}
    
    public static void rellenoVector (int [] vector,int n) {
        for (int i = 0; i < n; i++) {
            vector[i]=(int)(Math.random()*10);
        }
    }
    
    public static void muestroVector (int [] vector,int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(" [" + vector[i] + "] ");
        }
        
    }
}
