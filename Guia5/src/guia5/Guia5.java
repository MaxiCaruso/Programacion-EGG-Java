/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String[] equipo = new String[5];
        Scanner leer = new Scanner(System.in);
        System.out.println(" ingresar los alumnos del dia");
     for(int i = 0; i<equipo.length; i++){
         System.out.println("alumno:" + i+1);
         equipo[i] = leer.nextLine();
     }
     for(String alumno: equipo){
         System.out.println("los alumnos del dia son:");
         System.out.println(alumno);
     }
     
    }
    
}
