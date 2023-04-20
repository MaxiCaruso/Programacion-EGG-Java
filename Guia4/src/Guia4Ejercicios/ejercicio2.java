/*
 Diseñe una función que pida el nombre y la edad de N personas e 
imprima los datos de las personas ingresadas 
por teclado e indique si son mayores o menores de edad. 
Después de cada persona, el programa debe preguntarle al 
usuario si quiere seguir mostrando personas y frenar cuando 
el usuario ingrese la palabra “No”.
 */
package Guia4Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int edad, personas;
    String nombre= "a";
    edad = 0;
    personas =0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar cantidad de personas");
        personas = leer.nextInt();
        ingresoNombres(edad,personas,nombre);
    }
    
    public static void ingresoNombres(int edad,int personas, String nombre){
        Scanner leer = new Scanner(System.in);
        for (int i=0;i<personas;i++){
            System.out.println("igrese nombre y edad");
            nombre = leer.nextLine();
            edad = leer.nextInt();
        }
    }
    
    }

