/*
 Realice un programa que compruebe si una matriz dada es antisimétrica. 
Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta,
pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. 
La matriz traspuesta de una matriz A se denota por AT y 
se obtiene cambiando sus filas por columnas (o viceversa).

 */
package EjerciciosPracticos;

import java.util.Random;
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
        // TODO code application logic here// random rand genera numeros aleatoreos para guardarlos
        // sin usar math.random()*10 ( se evita la multiplicacion)
        // y lo guarda en una nueva variable
        Random rand = new Random(); 
        Scanner leer = new Scanner(System.in);
        int[][] matriz1,matriz2;
        boolean antisimetrica;
        antisimetrica=false;
        matriz1 = new int[3][3];
        matriz2 = new int[3][3];
        for (int f=0;f<matriz1.length;f++){
            // matriz1[0].length se coloca [0] para que cuente las columnas
            // se usa 0 por que siempre habrá columna 0 y contara la cantidad 
            // posiciones( columnas) que haya
            for (int c=0;c<matriz1[0].length;c++){
                matriz1[f][c] = leer.nextInt();
            }
        }
        for (int f=0;f<matriz2.length;f++){
            for (int c=0;c<matriz2[0].length;c++){
                matriz2[f][c] = matriz1[c][f];
            }
        }
        System.out.println("MATRIZ ONE");
            for (int f=0;f<matriz1.length;f++){
                for (int c=0;c<matriz1[0].length;c++){
                    System.out.print(" " + matriz1[f][c] + " ");
                }
                System.out.println(" ");
            }
            
            System.out.println("---------------");
            
        System.out.println("MATRIZ TWO");
        for (int f=0;f<matriz2.length;f++){
                for (int c=0;c<matriz2[0].length;c++){
                    System.out.print(" " + matriz2[f][c] + " ");
                }
                System.out.println(" ");
            }
        for (int f=0;f<matriz1.length;f++){
                for (int c=0;c<matriz1[0].length;c++){
                   if (matriz1[f][c] == (matriz2[f][c]*-1)){
                       antisimetrica = true;
                   }
                }
            }
        
        if (antisimetrica){
                System.out.println("su matriz es antisimetrica");
        }else{
            System.out.println("su matriz no es antisimetrica");
        }
    }
    
}

    