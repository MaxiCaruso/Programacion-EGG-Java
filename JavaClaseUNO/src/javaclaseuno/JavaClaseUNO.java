/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclaseuno;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class JavaClaseUNO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero1,numero2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        numero1 = leer.nextInt();
        System.out.println("Ingrese otro numero");
        numero2 = leer.nextInt();
        System.out.println("la suma de sus numeros es:" + (numero1 + numero2));
        
        
    }
    
}
