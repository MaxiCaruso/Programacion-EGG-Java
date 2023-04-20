 
package guia7ejercicio3calculadora;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Operacion {
    
    private double numero1;
    private double numero2;
    
    // Método constructor con todos los atributos pasados por parámetro.

Operacion (double numero1, double numero2){
    this.numero1 = numero1;
    this.numero2 = numero2;
    
}

//Método constructor sin los atributos pasados por parámetro. VACIO

Operacion (){
    
}

// Metodo get

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

// Metodo set

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    // Método para crearOperacion(): que le pide al usuario los 
    // dos números y los guarda en los atributos del objeto.
    
    public void crearOperacion(){
        
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE LOS NUMEROS A OPERAR");
        numero1 = leer.nextDouble();
        numero2 = leer.nextDouble();
        
    }
    
    // metodo sumar
    
    public void sumar(){
        System.out.println("la suma es: " + (numero1+numero2));
    }
    
    // metodo restar
    
    public void restar(){
        System.out.println("la resta es: " + (numero1-numero2));
    }

    // metodo multiplicar
    
    public void multiplicar(){
        if ((numero1 == 0) || (numero2 == 0)){
            System.out.println("la multiplicacion es: 0");
            System.out.println("ERROR");
        }else{
             System.out.println("la multiplicacion es: " + (numero1*numero2));
        }
    }
    
    // metodo dividir
    
    public void dividir(){
        if ((numero1 == 0) || (numero2 == 0)){
            System.out.println("la division es: 0");
            System.out.println("ERROR");
        }else{
             System.out.println("la division es: " + (numero1/numero2));
        }
    }
    
}


