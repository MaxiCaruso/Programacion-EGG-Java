
package guia8extras2nif;

import Entidades.NIF;
import Servicios.NIFServicio;


public class Guia8Extras2NIF {

    public static void main(String[] args) {
        
        NIFServicio persona = new NIFServicio();
        
        NIF maxi = persona.crearNIF();
        
        System.out.println("el sNIF es: ");
        persona.mostrarNIF(maxi);
        
        System.out.println(40123123%23);
        // corrobora la posicion de la letra
        
    }
    
}
