/*
Elaborar un algoritmo en el cuál se ingrese una letra
y se detecte si se trata de una vocal. 
Caso contrario mostrar un mensaje. 
Nota: investigar la función equals() de la clase String.

 */
package extras;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
            public static void main(String[] args) {
                // TODO code application logic here
                String letra;
                Scanner leer = new Scanner(System.in);
                    do{
                    System.out.println(" ingrese una letra");
                    letra = leer.next().toLowerCase();
                    }while (letra.length() !=1);

                    if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")){
                        System.out.println("su letra es una vocal");
                       }
                    else{
                        System.out.println("eso no es una vocal burro");
                    }
            }
}
    

