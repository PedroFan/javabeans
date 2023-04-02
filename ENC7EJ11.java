/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggenjava;
import java.util.Scanner ;


/**
 *
 * @author Josefina
 */
public class ENC7EJ11 {
/*
 Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto,
y luego codifique la palabra o frase ingresada de la siguiente manera: 
cada vocal se reemplaza por el carácter que se indica en la tabla y
el resto de los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios.
aeiou
@#$%*

while (!frase.endsWith(".")) {
System.out.println("Ingrese una frase (debe terminar en punto):");
frase = leer.nextLine().trim();
 */  

 
    public static byte e7e11() {
        Scanner leer=new Scanner(System.in) ;
        String frase ;
        do {
            System.out.println("Ingrese frase a codificar: ");
            frase = leer.nextLine() ;
        } while (!frase.substring(frase.length()-1,frase.length()).equals("."));
        System.out.println("su nueva frase es: "+codificada(frase));
    return 32;
    }
    
    public static String codificada(String frase ) {
        String nuevaFrase =""  ;
        for (int i=0 ; i<(frase.length()) ; i++) {
            switch (frase.substring(i, i+1)) {
                case "a" :
                case "A" :   
                    nuevaFrase= nuevaFrase.concat("@") ;
                    break ;
                case "e" :
                case "E" :    
                    nuevaFrase= nuevaFrase.concat("#") ;
                    break;
                case "i" :
                case "I" :
                    nuevaFrase= nuevaFrase.concat("$") ;
                    break;
                case "o" :
                case "O" :    
                    nuevaFrase= nuevaFrase.concat("%") ;
                    break ;
                case "u" :
                case "U" :
                    nuevaFrase= nuevaFrase.concat("*") ;
                    break ;    
                default :
                    nuevaFrase= nuevaFrase.concat(frase.substring(i, i+1)) ;
                    break ;  
            }
      
        }
    return nuevaFrase  ;    
    }
}