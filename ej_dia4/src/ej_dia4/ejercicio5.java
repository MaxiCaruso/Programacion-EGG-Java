/*
 Escriba un programa en el cual se ingrese un valor 
limite positivo, y a continuacion solicite numeros 
al usuario hasta que la suma de los numeros introducidos 
supere el limite inicial.

 */
package ej_dia4;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valorMax,num,suma;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un valor maximo positivo");
        suma = 0;
        valorMax = leer.nextInt();
        while (suma <= valorMax){
            System.out.println("ingrese valores a sumar");
            num = leer.nextInt();
            suma += num; // abreviatura para sumar
        }
            
    }
    
}
