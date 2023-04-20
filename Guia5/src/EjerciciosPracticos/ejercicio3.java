/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosPracticos;

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
    int n, cont1, cont2, cont3, cont4, cont5, aux_digito, aux_num;

            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese el tamaño del vector:");
            n = leer.nextInt();
            int[] numeros = new int[n];

            for (int i = 0; i < numeros.length; i++) {
                System.out.println("Ingrese el numero de la posicion " + (i+1) + " (1-99999):");
                do {
                    numeros[i] = leer.nextInt();
                } while (numeros[i] < 1 || numeros[i] > 99999);
            }

            cont1 = 0;
            cont2 = 0;
            cont3 = 0;
            cont4 = 0;
            cont5 = 0;

            for (int i = 0; i < n; i++) {
                aux_digito = 0;
                aux_num = numeros[i];

                do {
                    aux_num /= 10;
                    aux_digito += 1;
                } while (aux_num != 0);

                switch (aux_digito) {
                    case 1:
                        cont1 += 1;
                        break;
                    case 2:
                        cont2 += 1;
                        break;
                    case 3:
                        cont3 += 1;
                        break;
                    case 4:
                        cont4 += 1;
                        break;
                    case 5:
                        cont5 += 1;
                        break;
                    default:
                        break;
                }
            }

            System.out.println("La cantidad de numeros que tienen 1 digito: " + cont1);
            System.out.println("La cantidad de numeros que tienen 2 digitos: " + cont2);
            System.out.println("La cantidad de numeros que tienen 3 digitos: " + cont3);
            System.out.println("La cantidad de numeros que tienen 4 digitos: " + cont4);
            System.out.println("La cantidad de numeros que tienen 5 digitos: " + cont5);
        }
    }



