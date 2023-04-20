/*
 Crea una aplicación que a través de una función nos convierta una cantidad de euros 
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. 
La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será una cadena, 
este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
package Guia4Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pesos,dolares,chilenos,euros;
        dolares=0;
        chilenos=0;
        euros=0;
        Scanner leer = new Scanner(System.in);
        pesos = leer.nextInt();
        conversion(pesos, dolares, chilenos, euros);
    }
    
    public static void conversion(int pesos,int dolares,int chilenos,int euros){
        System.out.println("sus pesos son:" + (pesos*207.41) + "Dolares");
        System.out.println("sus pesos son:" + (pesos*3.89) + "Pesos Chilenos");
        System.out.println("sus pesos son:" + (pesos*223.96) + "Euros");
    }
    
}
