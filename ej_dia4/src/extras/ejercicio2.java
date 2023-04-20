/*
 Declarar cuatro variables de tipo entero A, B, C y D y 
asignarle un valor diferente a cada una. A continuación,
realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. 
Mostrar los valores iniciales y los valores finales de cada variable. 
Utilizar sólo una variable auxiliar.

 */
package extras;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a, b, c, d, auxiliar;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese los valores de A,B,C,D en ese orden");
        a = leer.nextInt();
        b = leer.nextInt();
        c = leer.nextInt();
        d = leer.nextInt();
        auxiliar = b;
        b = c;
        c = a;
        a = d;
        d = auxiliar;
        System.out.println("" + a + "" + b + "" + c + "" + d + "");
             
    }
    
}
