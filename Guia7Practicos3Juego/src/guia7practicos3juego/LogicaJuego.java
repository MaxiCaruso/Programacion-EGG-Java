

/*Crea una clase "Juego" que tenga un método "iniciar_juego" 
que permita a dos jugadores jugar un juego de adivinanza de números. 
El primer jugador elige un número y el segundo jugador intenta adivinarlo.
El segundo jugador tiene un número limitado de intentos y recibe una pista de 
"más alto" o "más bajo" después de cada intento. El juego termina cuando el segundo jugador 
adivina el número o se queda sin intentos. Registra el número de intentos necesarios para adivinar 
el número y el número de veces que cada jugador ha ganado.
*/


package guia7practicos3juego;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class LogicaJuego {

    Juego adivinanza = new Juego();

    Scanner leer = new Scanner(System.in);

    public void seleccionarJugador() {

        int winsPlayer1 = 0;
        int winsPlayer2 = 0;
        
        boolean terminar = false;
        
        while (terminar == false) {

            winsPlayer1 = adivinanza.getJ1();
            winsPlayer2 = adivinanza.getJ2();
            System.out.println(adivinanza.getJ1());
            System.out.println(adivinanza.getJ2());
            System.out.println("¿quien empezara jugando? 1 o 2, o elija 3 para salir a lo jumanji");
            System.out.println("---------");
            System.out.println(" el ganador sera el primero en adivinar 3 veces");
            int jugador;
            jugador = leer.nextInt();
            
            switch (jugador) {
                case 1:
                    iniciarJuegoPlayer1();
                    break;
                case 2:
                    iniciarJuegoPlayer2();
                    break;
                case 3:
                    System.out.println("gracias por jugar jumaxis");
                    break;
                default:
                    System.out.println("opcion incorrecta, es 1 o 2 , no sea pavo");
            }
            if (adivinanza.getJ1() == 3 || adivinanza.getJ2() == 3) {                
                terminar = true;
            } 
        }

        System.out.println("el jugador 1 gano: " + (winsPlayer1+1) + " veces");
        System.out.println("el jugador 2 gano: " + (winsPlayer2+1) + " veces");
    }

    public void iniciarJuegoPlayer2() {

        System.out.println("Jugador 1 ingrese el numero a adivinar");
        adivinanza.setNumeroAdivinar(leer.nextInt()); // traigo los atributos por medio del setter

        int intentos = 0; // creo variable auxiliar " intentos"
        int winsPlayer2 = adivinanza.getJ2();
        for (int i = 0; i < 10; i++) { // el jugador tiene 10 intentos
            intentos += 1;
            int adivinando;
            System.out.println("jugador 2 intente adivinar el numero");
            adivinando = leer.nextInt();

            if (adivinando == adivinanza.getNumeroAdivinar()) {
                System.out.println("adivinaste capo");
                i = 10;
                winsPlayer2 += 1;
                adivinanza.setJ2(winsPlayer2);

            } else {
                System.out.println(" vuelve a intentarlo");
                System.out.println("te quedan: " + (10 - intentos) + " no la pifies");
                if (adivinando < adivinanza.getNumeroAdivinar()) {
                    System.out.println("el numero es un poquitito mas alto");
                }
                if (adivinando > adivinanza.getNumeroAdivinar()) {
                    System.out.println("fua sandra era mas abajo");
                }
            }

        }

    }

    public void iniciarJuegoPlayer1() {

        System.out.println("Jugador 2 ingrese el numero a adivinar");
        adivinanza.setNumeroAdivinar(leer.nextInt()); // traigo los atributos por medio del setter

        int intentos = 0; // creo variable auxiliar " intentos"
        int winsPlayer1 = adivinanza.getJ1();
        for (int i = 0; i < 10; i++) { // el jugador tiene 10 intentos
            intentos += 1;
            int adivinando;
            System.out.println("jugador 1 intente adivinar el numero");
            adivinando = leer.nextInt();

            if (adivinando == adivinanza.getNumeroAdivinar()) {
                System.out.println("adivinaste capo");
                i = 10;
                winsPlayer1 += 1;
                adivinanza.setJ1(winsPlayer1);
            } else {

                System.out.println(" vuelve a intentarlo");
                System.out.println("te quedan: " + (10 - intentos) + " no la pifies");
                if (adivinando < adivinanza.getNumeroAdivinar()) {
                    System.out.println("el numero es un poquitito mas alto");
                }
                if (adivinando > adivinanza.getNumeroAdivinar()) {
                    System.out.println("fua sandra era mas abajo");
                }
            }

        }

    }

}
