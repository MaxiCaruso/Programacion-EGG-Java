/*
 Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
Por ejemplo, si el cuadrado tiene 4 elementos por 
lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *

 */
package ej_dia4;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class ejercicio8 {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
            // TODO code application logic here
            int valorLado;
            Scanner leer = new Scanner(System.in);
            System.out.println(" ingrese el valor del lado del cuadrado");
            valorLado = leer.nextInt();

                for (int f = 0; f < valorLado; f++){
                    for (int c = 0; c < valorLado; c++){
                        if (f != 0 && f != valorLado-1 && c != 0 && c != valorLado-1){
                            System.out.print("  ");
                        }
                        else {
                            System.out.print("* ");
                        }
                    }
                    System.out.println("");
                }
        }  
}
