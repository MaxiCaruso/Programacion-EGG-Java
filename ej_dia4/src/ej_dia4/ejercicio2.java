package ej_dia4;


import java.util.Scanner;

/*
 Crear un programa que pida una frase y si esa frase es igual a “eureka” 
el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.
Nota: investigar la función equals() en Java.

 */

/**
 *
 * @author Pc
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String palabra;
        System.out.println("diga una palabra");
        Scanner leer = new Scanner(System.in);
        palabra = leer.nextLine();
        if (palabra.equals("eureka")){
            System.out.println("tu palabra es EUREKA");       
         }
        else {
            System.out.println("tu palabra no coincide con lo que buscamos");
        }
    }    
            
            
            
            
            
            
}
