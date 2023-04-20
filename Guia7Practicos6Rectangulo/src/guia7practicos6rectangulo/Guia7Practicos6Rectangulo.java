/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7practicos6rectangulo;

/**
 *
 * @author Pc
 */
public class Guia7Practicos6Rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        Rectangulo R1 = new Rectangulo();
        
        R1.medidas();
        
        System.out.println("el area es: " + R1.calcularArea());
        
        R1.dibujarRectangulo();
        
    }
    
}
