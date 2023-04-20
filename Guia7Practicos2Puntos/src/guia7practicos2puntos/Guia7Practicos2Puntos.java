
package guia7practicos2puntos;

/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, 
sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto.
Generar un objeto puntos usando un método crearPuntos() que le pide al usuario
los dos números y los ingresa en los atributos del objeto. 
Después, a través de otro método calcular y devolver la distancia que existe
entre los dos puntos que existen en la clase Puntos. Para conocer como calcular 
la distancia entre dos puntos consulte el siguiente link:
*/

public class Guia7Practicos2Puntos {


    public static void main(String[] args) {
        
       Puntos coord1 = new Puntos();
       
       coord1.crearPuntos();
       
       coord1.mostrarPuntos();
       
        System.out.println("la distancia entre coordenadas es: " + coord1.calcular());
       
        
    }
    
}
