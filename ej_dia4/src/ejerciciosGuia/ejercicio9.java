/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosGuia;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero, suma,contador;
        Scanner leer = new Scanner(System.in);
        suma = 0;
        contador = 0;
            do {
                System.out.println("ingrese 20 numeros");
                numero = leer.nextInt();
                contador = contador + 1;
                if (numero == 0){
                    System.out.println(" se capturo el numero 0 ");
                    break;
                }
                suma = suma + numero;
            } while (contador<20);
            System.out.println("la suma de los numeros es: " + suma);
            }
           
        
        
    }
         
