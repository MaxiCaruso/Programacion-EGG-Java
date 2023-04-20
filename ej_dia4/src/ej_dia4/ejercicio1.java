/*
 Crear un programa que dado un número determine si es par o impar.
*/
package ej_dia4;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        System.out.println("Ingrese un numero");
        Scanner leer = new Scanner(System.in);
        numero = leer.nextInt();
        if (numero%2 !=0){
            System.out.println("tu numero es impar");
            }
        else {
            System.out.println("tu numero es par");
        }

    }
    
}
