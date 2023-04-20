/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia4Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num1, num2, suma, resta, multiplicacion, division, opcion;
        char salida;
        System.out.println("ingrese dos numeros a operar");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        suma = sumar(num1,num2);
        resta = restar(num1,num2);
        multiplicacion = multiplicar(num1,num2);
        division = dividir(num1,num2);
        System.out.println(" - CALULADORA BARATA -");
        System.out.println(" - INGRESE SU OPCION DESEADA -");
        System.out.println(" 1.sumar ");
        System.out.println(" 2.restar ");
        System.out.println(" 3.multiplicar ");
        System.out.println(" 4.dividir ");
         System.out.println(" 5.salir ");
        opcion = leer.nextInt();
        Menu: while (opcion != 5){
        switch (opcion){
            case 1:
                System.out.println("la suma es:" + suma);
                break;
            case 2:
                System.out.println("la resta es:" + resta);
                break;
            case 3:
                 System.out.println("la multiplicacion es:" + multiplicacion);
                break;
            case 4:
                 System.out.println("la division es:" + division);
                 break;
            case 5:
                 System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                salida = leer.next().toUpperCase().charAt(0) ;
                if (salida == 'S'){
                    System.out.println("gracias por visitar esta calculadora de mierda");
                break Menu;
                }    
                else {
                    opcion = 0;
                }
                 break;
            default:
                System.out.println("su opcion no es valida");
                
                break;
                
        }
        }
        
       
       
       
        
    }
    
    public static int sumar (int num1,int num2){
        int resultado;
        resultado = num1 + num2;
        return resultado;
    }
    
     public static int restar (int num1,int num2){
          int resultado;
        resultado = num1 - num2;
        return resultado;
    }
     
      public static int multiplicar (int num1,int num2){
          int resultado;
        resultado = num1 * num2;
        return resultado;
    }
      
       public static int dividir (int num1,int num2){
          int resultado;
        resultado = num1 / num2;
        return resultado;
    }
}
