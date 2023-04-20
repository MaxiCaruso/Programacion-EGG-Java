/*
Realizar un programa que rellene un matriz de 4 x 4 
de valores aleatorios y muestre la traspuesta de la matriz. 
La matriz traspuesta de una matriz A se denota por B y se 
obtiene cambiando sus filas por columnas (o viceversa).

 */
package EjerciciosPracticos;

import java.util.Random;

/**
 *
 * @author Pc
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // random rand genera numeros aleatoreos para guardarlos
        // sin usar math.random()*10 ( se evita la multiplicacion)
        // y lo guarda en una nueva variable
        Random rand = new Random(); 
        
        int[][] matriz1,matriz2;
        matriz1 = new int[4][4];
        
        for (int f=0;f<matriz1.length;f++){
            // matriz1[0].length se coloca [0] para que cuente las columnas
            // se usa 0 por que siempre habrá columna 0 y contara la cantidad 
            // posiciones( columnas) que haya
            for (int c=0;c<matriz1[0].length;c++){
                int numeroAleatorio = rand.nextInt(100);
                matriz1[f][c] = numeroAleatorio; 
            }
        }
        System.out.println("MATRIZ ORIGINAL");
            for (int f=0;f<matriz1.length;f++){
                for (int c=0;c<matriz1[0].length;c++){
                    System.out.print(" " + matriz1[f][c] + " ");
                }
                System.out.println(" ");
            }
            
            System.out.println("---------------------");
            
            System.out.println("MATRIZ MUTANTE");
            for (int c=0;c<matriz1[0].length;c++){
                for (int f=0;f<matriz1.length;f++){
                    System.out.print(" " + matriz1[f][c] + " ");
                }
                System.out.println(" ");
            }
        
    }
    
}
