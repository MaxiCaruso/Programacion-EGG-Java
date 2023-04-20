
package Servicios;

import Entidades.Persona;
import java.util.Scanner;


public class PersonaServicio {
    Scanner leer = new Scanner(System.in);
    
    public boolean esMayorEdad(Persona persona){ // colocamos persona pero esto sirve para todas las personas que carguemos
         return (persona.getEdad()>= 18);
       // de esta forma se simplifica y 
       // me devuelve true cuando se cumpla 
    }
    
    public Persona crearPersona(){
        
        System.out.println("-------------------------------");
        System.out.println("ingrese los datos de la persona");
        System.out.println("-------------------------------");
        System.out.println("nombre:");
        String nombre = leer.nextLine();
        System.out.println("edad: ");
        int edad = leer.nextInt();
        System.out.println("sexo: ");
        char sexo = leer.next().toUpperCase().charAt(0);// se agrega.charAt(0) por que lee el primer caracter
        // colocamos .toupperCase para que lo devuelva en mayuscula
        System.out.println("peso en Kg: ");
        int peso = leer.nextInt();
        System.out.println("altura en mt: ");
        double altura = leer.nextDouble();
        leer.nextLine(); // se usa para que se pueda cargar todos los datos
        // nos da mas espacio en lineas para seguir escribiendo
        // tambien se puede agregar a la clase scanner .useDelimiter("\n")
        return new Persona (nombre, edad, sexo, peso, altura);
    }
    
    public int calcularIMC(Persona persona){
        // traigo la instancia persona,del clase u objeto Persona
        double imc = persona.getPeso()/(Math.pow(persona.getAltura(), 2));
        // para simplificar el codigo creamos la variable imc para alojar el 
        // resultado de la formula
        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25){
            return 0;
        } else{ // ultima condicion (imc > 25) 
            return 1;
        }
    }
    
}
