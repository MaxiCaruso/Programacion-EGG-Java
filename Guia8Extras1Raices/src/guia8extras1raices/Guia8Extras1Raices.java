


package guia8extras1raices;

import Entidades.Raices;
import Servicios.RaicesServicio;



public class Guia8Extras1Raices {

    
    

    public static void main(String[] args) {
       
        
        RaicesServicio calculo = new RaicesServicio();
        
        Raices ecuacion = calculo.crearCoeficientes();
        
        // raices es el tipo de dato, ecuacion es la variable, y lo igualo 
        // a la funcion, hace las de scanner pero carga los atributos de mi objeto
        
        System.out.println(calculo.getDiscriminante(ecuacion));
        
        calculo.calcular(ecuacion);
        
    }
    
}
