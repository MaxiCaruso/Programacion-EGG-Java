/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7practicos3juegoversion2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Juego {
    


public class Juego {
    private int numeroAdivinar;
    private int numIntentos;
    private int ganadosJugador1;
    private int ganadosJugador2;

    public void iniciar_juego() {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        // Pedimos al primer jugador que ingrese un número
        System.out.print("Jugador 1, ingrese un número entre 1 y 100: ");
        int numeroElegido = sc.nextInt();

        // Validamos que el número esté dentro del rango
        while (numeroElegido < 1 || numeroElegido > 100) {
            System.out.println("El número debe estar entre 1 y 100. Inténtalo de nuevo.");
            System.out.print("Jugador 1, ingrese un número entre 1 y 100: ");
            numeroElegido = sc.nextInt();
        }

        // Generamos el número a adivinar
        numeroAdivinar = rnd.nextInt(100) + 1;

        // Pedimos al segundo jugador que adivine el número
        System.out.println("\nJugador 2, intenta adivinar el número elegido por el jugador 1.");

        while (numIntentos < 6) { // Máximo de 6 intentos
            System.out.print("Intento #" + (numIntentos+1) + ": ");
            int numIngresado = sc.nextInt();

            if (numIngresado == numeroAdivinar) {
                System.out.println("¡Felicidades! Adivinaste el número en " + (numIntentos+1) + " intentos.");
                if ((numIntentos+1) % 2 == 0) { // Si es un número par de intentos, ganó el jugador 2
                    ganadosJugador2++;
                } else { // Si es un número impar de intentos, ganó el jugador 1
                    ganadosJugador1++;
                }
                break;
            } else if (numIngresado < numeroAdivinar) {
                System.out.println("El número es más alto.");
            } else {
                System.out.println("El número es más bajo.");
            }

            numIntentos++;
        }

        if (numIntentos == 6) { // Se acabaron los intentos
            System.out.println("Se acabaron los intentos. El número era " + numeroAdivinar + ".");
            if (numIntentos % 2 == 0) { // Si es un número par de intentos, ganó el jugador 2
                ganadosJugador2++;
            } else { // Si es un número impar de intentos, ganó el jugador 1
                ganadosJugador1++;
            }
        }

        // Mostramos los resultados
        System.out.println("\nJuego terminado.");
        System.out.println("Número de intentos necesarios: " + (numIntentos+1));
        System.out.println("Jugador 1 ganó " + ganadosJugador1 + " veces.");
        System.out.println("Jugador 2 ganó " + ganadosJugador2 + " veces.");
    }
}
    
}
