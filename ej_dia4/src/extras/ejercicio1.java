/*
Dado un tiempo en minutos, calcular su equivalente en días y horas.
Por ejemplo, si el usuario ingresa 1600 minutos, 
el sistema debe calcular su equivalente: 1 día, 2 horas.

 */
package extras;

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
        
        int tiempoMinutos, dias, horas;
        Scanner leer = new Scanner(System.in);
        System.out.println(" ingrese el tiempo en minutos");
        tiempoMinutos = leer.nextInt();
        dias = tiempoMinutos / 1440;
        tiempoMinutos = tiempoMinutos%1440;
        horas = tiempoMinutos / 60;
        System.out.println("sus dias son: " + dias);
        System.out.println("sus horas son: " + horas);
        
        
        
        

        
    }
    
}
