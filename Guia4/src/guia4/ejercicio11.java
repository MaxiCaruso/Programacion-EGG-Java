/*
 Escribir un programa que procese una secuencia de 
caracteres ingresada por teclado y terminada en punto,
y luego codifique la palabra o frase ingresada de la 
siguiente manera: cada vocal se reemplaza por el 
carácter que se indica en la tabla y el resto de los 
caracteres (incluyendo a las vocales acentuadas) se
mantienen sin cambios.


Realice un subprograma que reciba una secuencia de caracteres 
y retorne la codificación correspondiente. 
Utilice la estructura “según” para la transformación. 
Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println(" ingrese una frase");
        String frase;
        String MsjeCodificado;
        frase = leer.nextLine();
       MsjeCodificado = codificacion(frase);
        System.out.println(MsjeCodificado);
        
    }
    public static String codificacion(String frase){ // public static string ES PARA FUNCION y void es para subprograma                     
        int longitudFrase;
        String codigo;
        String mensaje;
        longitudFrase = frase.length();
        codigo = "";
        mensaje = "";
        for (int i =0;i<longitudFrase;i++){
            codigo = frase.substring(i,i+1);
            switch (codigo){
                case "a":
                    codigo = "@";
                    break;
                case "e":
                    codigo = "#";
                    break;
                case "i":
                    codigo = "$";
                    break;
                case "o":
                    codigo = "%";
                    break;
                case "u":
                    codigo = "*";
                    break;   
            }
            mensaje += codigo;
        }
        System.out.println("");
        return mensaje;
    }
}
