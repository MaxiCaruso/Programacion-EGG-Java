/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int numero1, numero2;
        System.out.println("ingrese numeros para ver si son multiplos");
        numero1 = leer.nextInt();
        numero2 = leer.nextInt();
        esMultiplo(numero1,numero2);
    }
    public static void esMultiplo(int numero1, int numero2){
        if (numero1 % numero2 == 0){
            System.out.println("los numeros son multiplos");
            
        }
        else{
            System.out.println("los numeros no son multiplos");
        }
    }
}
