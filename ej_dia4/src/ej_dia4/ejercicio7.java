/*
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben 
llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, 
el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, 
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), 
y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e 
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes 
funciones de Java Substring(), Length(), equals().

 */
package ej_dia4;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int correcto, incorrecto;
        String frase;

         Scanner leer = new Scanner(System.in);
            correcto = 0;
            incorrecto = 0;

            System.out.println("Ingrese una frase de 5 caracteres que comience con X y termine en O (&&&&& para finalizar):");
            do {
                frase = leer.nextLine();
                if (frase.length() == 5 && frase.substring(0,1).equals("X") && frase.substring(4,5).equals("O")) {
                    correcto = correcto + 1;
                }
                else if (frase.equals("&&&&&") == true) {
                    System.out.println("Contando...");
                }
                else {
                    incorrecto = incorrecto + 1;
                }
            } while (frase.equals("&&&&&") == false);

            System.out.println("Frases correctas: " + correcto);
            System.out.println("Frases incorrectas: " + incorrecto);
        }
    
 }

    

