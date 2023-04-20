/*
 Realizar un programa que pida dos números 
enteros positivos por teclado y muestre por 
pantalla el siguiente menú:El usuario deberá 
elegir una opción y el programa deberá mostrar 
el resultado por pantalla y luego volver al menú.
El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, 
en vez de salir del programa directamente, se debe mostrar el 
siguiente mensaje de confirmación: ¿Está seguro que desea 
salir del programa (S/N)? Si el usuario selecciona el 
carácter ‘S’ se sale del programa, caso contrario se vuelve 
a mostrar el menú.

 */
package ej_dia4;

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
        // TODO code application logic here
        int num1, num2, opcion;
        char salida;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero a operar");
        num1 = leer.nextInt();
        System.out.println("ingrese otro numero a operar");
        num2 = leer.nextInt();
        System.out.println("MENU");
        System.out.println(" ELIJA UNA OPCION ");
        System.out.println("1.SUMAR ");
        System.out.println("2.RESTAR ");
        System.out.println("3.MULTIPLICAR ");
        System.out.println("4.DIVIDIR ");
        System.out.println("5.SALIR ");
        opcion = 0;
        Menu: while (opcion != 5){
            opcion = leer.nextInt();
            switch (opcion){
            case 1:
                System.out.println("la suma es: " + (num1+num2));
                break;
            case 2:
                System.out.println("la resta es: " + (num1-num2));
                break;
            case 3:
                System.out.println("la multiplicacion es: " + (num1*num2));
                break;
            case 4:
                System.out.println("la division es: " + (num1/num2));
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
                 System.out.println("su opcion no esta dentro de lo solicitado");
                 break;
            }
         System.out.println("MENU");
        System.out.println(" ELIJA UNA OPCION ");
        System.out.println("1.SUMAR ");
        System.out.println("2.RESTAR ");
        System.out.println("3.MULTIPLICAR ");
        System.out.println("4.DIVIDIR ");
        System.out.println("5.SALIR ");   
        }
    }
}