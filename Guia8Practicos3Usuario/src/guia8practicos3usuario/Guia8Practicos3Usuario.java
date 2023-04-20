/*
Realizar una clase llamada Persona en el paquete de entidades 
que tengan los siguientes atributos: nombre, edad, sexo 
(‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro), peso y altura.
Si desea añadir algún otro atributo, puede hacerlo. 
Agregar constructores, getters y setters.
En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:

Método esMayorDeEdad(): indica si la persona es mayor de edad. 
La función devuelve un booleano.

Metodo crearPersona(): el método crear persona, le pide los valores de los
atributos al usuario y después se le asignan a sus respectivos atributos para 
llenar el objeto Persona. Además, comprueba que el sexo introducido sea correcto,
es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje

Método calcularIMC(): calculara si la persona está en su peso ideal 
(peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor 
menor que 20, significa que la persona está por debajo de su peso ideal y 
la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 
(incluidos), significa que la persona está en su peso ideal y la función devuelve un 0.
Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa 
que la persona tiene sobrepeso, y la función devuelve un 1.




 */
package guia8practicos3usuario;

import Entidades.Persona;
import Servicios.PersonaServicio;

public class Guia8Practicos3Usuario {

    public static void main(String[] args) {
        PersonaServicio ps = new PersonaServicio();
        // creamos un arreglo para ahorrarnos crear 4 variables para las 4 personas
        Persona[] listaPersonas = new Persona[4];

        // cargamos los datos con un for, simplificando el tipeo del codigo
        for (int i = 0; i < listaPersonas.length; i++) {
            listaPersonas[i] = ps.crearPersona();
        }

        for (int i = 0; i < listaPersonas.length; i++) {
            int imc = ps.calcularIMC(listaPersonas[i]);
            if (imc == -1) {
                System.out.println("el usuario: " + listaPersonas[i].getNombre() + "le tiene que entrar al morfi");
            } else if (imc == 0) {
                System.out.println("el usuario: " + listaPersonas[i].getNombre() + "segui asi papa");
            } else { // ultima condicion (imc > 25) 
                System.out.println("el usuario: " + listaPersonas[i].getNombre() + "o menos mandivula o al medico");
            }
        }
        
        int imc_1 = 0;
        int imc0 = 0;
        int imc1 = 0;
        int mayores = 0;
        int menores = 0;
                
        // for simplificado 
        for (Persona persona : listaPersonas) {
            // desde listaPersonas sabemos que empieza en 0 y termina en el 
            // anterior de la longitud del arreglo y se incrementa en 1
            int imc = ps.calcularIMC(persona);
            if (imc == -1) {
                System.out.println("el usuario: " + persona.getNombre() + "le tiene que entrar al morfi");
                imc_1++;
            } else if (imc == 0) {
                System.out.println("el usuario: " + persona.getNombre() + "segui asi papa");
                imc0++;
            } else { // ultima condicion (imc > 25) 
                System.out.println("el usuario: " + persona.getNombre() + "o menos mandivula o al medico");
                imc1++;
            }
            
            if (ps.esMayorEdad(persona)) {
                mayores++;
            }else{
                menores++;
            }
        }
        System.out.println("el porcentaje flaquitos es: " + ((imc_1*100)/listaPersonas.length));
        System.out.println("el porcentaje normalitos es: " + ((imc0*100)/listaPersonas.length));
        System.out.println("el porcentaje peppa pig es: " + ((imc1*100)/listaPersonas.length));
        System.out.println("el porcentaje de adultos es: " + ((mayores*100)/listaPersonas.length)); 
        System.out.println("el porcentaje de bendiciones es: " + ((menores*100)/listaPersonas.length)); 
    }   
}
