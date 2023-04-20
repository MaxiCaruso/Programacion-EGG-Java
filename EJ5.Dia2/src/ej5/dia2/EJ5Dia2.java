/*
 * Escribir un programa que lea un número entero por teclado y 
muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 

 */
package ej5.dia2;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class EJ5Dia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        System.out.println("ingrese un numero");
        Scanner leer = new Scanner(System.in);
        numero = leer.nextInt();
        System.out.println("el doble de su numero es: " + (numero*2));
        System.out.println("el triple de su numero es: " + (numero*3));
        System.out.println("la Raiz cuadrada de su numero es: " + (Math.sqrt(numero)));
        System.out.println("gracias por usar el programa");
    }
    
}
