/*
Programa Nespresso.
Desarrolle una clase Cafetera en el paquete Entidades con los atributos capacidadMáxima 
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual 
(la cantidad actual de café que hay en la cafetera). 
Agregar constructor vacío y con parámetros así como setters y getters. 
Crear clase CafeteraServicio en el paquete Servicios con los siguiente:

Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 

Método servirTaza(int): se pide el tamaño de una taza vacía,
el método recibe el tamaño de la taza y simula la acción de servir la taza 
con la capacidad indicada. Si la cantidad actual de café “no alcanza” para 
llenar la taza, se sirve lo que quede. El método le informará al usuario si
se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.

Método vaciarCafetera(): pone la cantidad de café actual en cero. 

Método agregarCafe(int): se le pide al usuario una cantidad de café,
el método lo recibe y se añade a la cafetera la cantidad de café indicada.


*/

package nespresso;

import java.util.Scanner;

public class Nespresso {

    
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cafetera phillips = new Cafetera(1250,0);
        CafeteraServicio c1 = new CafeteraServicio();
        
        
        System.out.println("--------------------------");
        System.out.println("Bienvenido a la colombiana");
        System.out.println("--------------------------");
        System.out.println("ingrese la opcion deseada");
        System.out.println("");
        int opcion = 0;
        do {
            System.out.println("1. Llenar Cafetera ");
            System.out.println("2. Servir Taza");
            System.out.println("3. Vaciar Cafetera");
            System.out.println("4. Agregar Cafe");
            System.out.println("5. Apagar");
            opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    c1.llenarCafetera(phillips);
                    break;
                case 2:
                    c1.servirTaza(phillips);
                    break;
                case 3:
                    c1.vaciarCafetera(phillips);
                    break;
                case 4:
                    c1.agregarCafe(phillips);
                    break;
                case 5:
                    System.out.println("anda tomar té bobo");
                    break;
                default:
                    System.out.println("error, intente nuevamente");
                    opcion=2;
            }
        } while (opcion < 5);
    
    }

}
