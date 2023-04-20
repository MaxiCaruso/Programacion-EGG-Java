/*
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit.
La fórmula correspondiente es: F = 32 + (9 * C / 5).

 */
package ej4.dia2;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class EJ4Dia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float centigrados;
        System.out.println("Ingresar la Temperatura en °C ");
        Scanner leer = new Scanner(System.in);
        centigrados = leer.nextInt();
        System.out.println("la Temperatura en Farenheit es: " + (32 + 9 * centigrados / 5 ));
        
        
                
    }
    
}
