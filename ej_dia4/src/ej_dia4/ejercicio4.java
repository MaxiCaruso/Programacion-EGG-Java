/*
 Escriba un programa que pida una frase o palabra y 
valide si la primera letra de esa frase es una ‘A’.
Si la primera letra es una ‘A’, se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, 
se deberá imprimir “INCORRECTO”. Nota: investigar la función 
Substring y equals() de Java.

 */
package ej_dia4;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String palabra;
        Scanner leer = new Scanner(System.in);
        System.out.println("diga una palabra");
        palabra = leer.nextLine();
        String primerLetra = palabra.substring(0,1);
        primerLetra = primerLetra.toUpperCase(); // strings son inmutables, si se le aplica un metod este no cambia 
        if (primerLetra.equals("A")){
            System.out.println("correcto");
        }
        else{
            System.out.println("incorrecto");
        }
    }
    
}
