/*
 Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde 
la suma de sus filas, sus columnas y sus diagonales son idénticas. 
Crear un programa que permita introducir un cuadrado por teclado y 
determine si este cuadrado es mágico o no. El programa deberá comprobar 
que los números introducidos son correctos, es decir, están entre el 1 y el 9.
 */
package EjerciciosPracticos;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] magica = new int[3][3];
        System.out.println("ingrese los valores de la matriz magica");
        int rangoSimple;

        for (int f = 0; f < magica.length; f++) {
            for (int c = 0; c < magica[0].length; c++) {

                /* PARA EVITAR QUE SE INGRESE NUMERO FUERA DE RANGO
                primero se coloca el metodo LEER
                2. se crea un while donde diga si esta dentro del rango
                UTILIZAR || PARA DECIR SI ES UNA COSA O LA OTRA.
                3. volver a LEER la variable mal ingresada
                4. fuera del while realizar la sentencia necesitada.
                 */
                rangoSimple = leer.nextInt();
                while (rangoSimple < 1 || rangoSimple > 9) {
                    System.out.println("ERROR FATAL, ingrese numeros entre 1 y 9");
                    rangoSimple = leer.nextInt();
                }
                magica[f][c] = rangoSimple;
            }
        }
        System.out.println("SU MATRIZ ES LA SIGUIENTE:");
        for (int f = 0; f < magica.length; f++) {
            for (int c = 0; c < magica[0].length; c++) {
                System.out.print(" " + magica[f][c] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("----------------");

        int F1, F2, F3;
        F1 = 0;
        F2 = 0;
        F3 = 0;
        for (int f = 0; f < magica.length; f++) {
            F1 += magica[0][f];
            F2 += magica[1][f];
            F3 += magica[2][f];
        }

        int C1, C2, C3;
        C1 = 0;
        C2 = 0;
        C3 = 0;
        for (int c = 0; c < magica.length; c++) {
            C1 += magica[c][0];
            C2 = C2 + magica[c][1];
            C3 += magica[c][2];
        }

        int D1;
        D1 = 0;
        for (int f = 0; f < magica.length; f++) {
            for (int c = 0; c < magica[0].length; c++) {
                if (f == c) {
                    D1 += magica[f][c];
                }
            }

        }

        int D2 = 0;
        int c = 2;
        for (int f = 0; f < magica.length; f++) {
            D2 += magica[f][c];
            c--;

        }
        System.out.println("la suma de las filas es: " + F1 + " " + F2 + " " + F3 + " ");
        System.out.println("la suma de las columnas es: " + C1 + " " + C2 + " " + C3 + " ");
        System.out.println("la suma de las diagonales es: " + D1 + " " + D2 + "");

        if ((F1 == 15) && (F2 == 15) && (F3 == 15) && (C1 == 15) && (C2 == 15) && (C3 == 15) && (D1 == 15) && (D2 == 15)) {
            System.out.println("la matriz es mágica");
        } else {
            System.out.println("la matriz no es mágica");
        }
    }

}
