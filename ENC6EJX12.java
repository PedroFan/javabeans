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
public class ENC6EJX12 {
    public static byte e6ex12 () {
        int i, j, k, max=999, num;
        for (i=0;i<=max;i++) {
            num=i;
            k=0;
             while(num%10>=0&&num!=0) {
                num=num/10;
                k++;
                }
            //System.out.println(k);
            for (j=3;j>0;j--) {
                if (j>k){
                    System.out.print(".");
                } else {
                    if (Integer.toString(i).charAt(k-j)==('3')){ 
                    //System.out.print(Integer.toString(i, k-j));
                    System.out.print("E");
                    } else {
                    System.out.print(Integer.toString(i).charAt(k-j));
                    }
                }
            }
            System.out.println("");
        }
        return 29;
    }
}