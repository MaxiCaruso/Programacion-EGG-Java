
package Servicios;

import Entidades.Raices;
import java.util.Scanner;


public class RaicesServicio {
    
    
    Scanner leer = new Scanner(System.in);
    
    
    
    public Raices crearCoeficientes(){
        System.out.println("ingrese coeficiente A");
        double a = leer.nextDouble() ;
        System.out.println("ingrese coeficiente B");
        double b = leer.nextDouble() ;
        System.out.println("ingrese coeficiente C");
        double c = leer.nextDouble() ;
        return new Raices(a,b,c);
    }
    
    public double getDiscriminante(Raices r1){
        return ((Math.pow(r1.getB(), 2))-(4*r1.getA()*r1.getC()));
    }
    
    public boolean tieneRaices(Raices r1){
        
        return (getDiscriminante(r1) > 0) ;
        // puedo devolver el resultado con una variable aux
    }
    public boolean tieneRaiz(Raices r1){
        return (getDiscriminante(r1) == 0);
        // puedo llamar a la funcion y comprarla
    }
    
    public void obtenerRaices(Raices r1){
         if (tieneRaices(r1)) {
            double menosB = -r1.getB();
            double raiz = Math.sqrt(Math.pow(r1.getB(), 2)-(4*r1.getA()*r1.getC()));
            double sobre = (2*r1.getA());
            // con todas estas variables resumimos la formula
            // de la ecuacion de 2do grado
            double raiz1 = (menosB + raiz) / sobre;
            double raiz2 = (menosB - raiz) / sobre;
            // usamos r1 y r2 para guardar los resultados   
            System.out.println("raiz.1 = " + raiz1 + " raiz.2 = " + raiz2);
        }

        
        
    }
    public void obtenerRaiz(Raices r1){
         if (tieneRaiz(r1)) {
            double menosB = -r1.getB();
            double raiz = Math.sqrt(Math.pow(r1.getB(), 2)-(4*r1.getA()*r1.getC()));
            double sobre = (2*r1.getA());
            // con todas estas variables resumimos la formula
            // de la ecuacion de 2do grado
            double raiz1 = (menosB + raiz) / sobre;
            // usamos raiz1 para guardar los resultados            
            System.out.println("raiz.1 = " + raiz1);
            // imprimimos los resultados
        }   
    }
    public void calcular(Raices r1){
        if (tieneRaices(r1)) {
            obtenerRaices(r1); 
        }else if (tieneRaiz(r1)) {
            obtenerRaiz(r1);
        }else{
            System.out.println("tiene menos raices que un cactus");
        }
        
        
    }    
    
}



