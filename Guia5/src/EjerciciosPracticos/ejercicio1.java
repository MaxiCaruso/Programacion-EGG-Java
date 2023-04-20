/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosPracticos;

/**
 *
 * @author Pc
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = new int[100];
        int aux = 0;
// se crea un auxiliar para que al dar vuelta el bucle aumente de 1 en 1 y llegue al valor indicado

        for (int i = 0; i < numeros.length; i++) {
            aux += 1;
            numeros[i] = aux;
        }
 // imprime los numeros de 1 en 1 y en forma descendiente poniendo i--
        for (int i = (numeros.length-1); 0 <= i; i--) {
            System.out.println(numeros[i]);
        }
    }
}
    
    

