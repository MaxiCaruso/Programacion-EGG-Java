/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3.dia2;

import static java.lang.Character.toLowerCase;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class EJ3Dia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase ;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una frase");
        frase = leer.nextLine();
        System.out.println(frase.toLowerCase());
        System.out.println(frase.toUpperCase());
                
    }
    
}
