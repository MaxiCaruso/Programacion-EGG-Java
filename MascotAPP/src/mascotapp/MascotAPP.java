/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp;

import mascotapp.entidades.Mascota;

/**
 *
 * @author Pc
 */
public class MascotAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Mascota m1 = new Mascota();
        m1.apodo = "nina";
        m1.nombre = "perla";
        m1.tipoAnimal = "perro";
        m1.edad = 3;
        m1.raza = "bulldog frances";
        m1.color = "negro";
        m1.cola = false;
        System.out.println(m1.apodo+" "+m1.edad+" "+m1.tipoAnimal);
        
        Mascota m2 = new Mascota();
        
        
    }
    
}
