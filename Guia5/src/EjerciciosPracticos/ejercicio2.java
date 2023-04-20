/*
Realizar un algoritmo que llene un vector de tamaño N con 
valores aleatorios y le pida al usuario un número a buscar en el vector. 
El programa mostrará dónde se encuentra el numero y si se encuentra repetido

 */
package EjerciciosPracticos;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,buscarNum;
        boolean encontro;
        encontro = false;
        System.out.println("ingrese tamaño del vector");
        Scanner leer = new Scanner(System.in);
        n = leer.nextInt();
        int[] valores = new int[n];
        for (int i = 0; i<n; i++){
            valores[i] = (int)(Math.random()+ 10);
        }
        System.out.println("ingrese numero a buscar");
        buscarNum = leer.nextInt();
        for (int i = 0;i<n;i++){
        if (valores[i] == buscarNum){
            System.out.println("su numero" + buscarNum + "esta en la posicion: " + i+1);
            encontro = true;
        }
        }
        if(encontro == false){
            System.out.println("su numero no esta en los parametros");
        }
        
        
    
    
}
}