
/*Crea una clase "Juego" que tenga un método "iniciar_juego" 
que permita a dos jugadores jugar un juego de adivinanza de números. 
El primer jugador elige un número y el segundo jugador intenta adivinarlo.
El segundo jugador tiene un número limitado de intentos y recibe una pista de 
"más alto" o "más bajo" después de cada intento. El juego termina cuando el segundo jugador 
adivina el número o se queda sin intentos. Registra el número de intentos necesarios para adivinar 
el número y el número de veces que cada jugador ha ganado.
*/

package guia7practicos3juego;


public class Juego {
    
    private int numeroAdivinar;
    
    private int J1;
    private int J2;

    public Juego(int numeroAdivinar, int J1, int J2) {
        this.numeroAdivinar = numeroAdivinar;
        this.J1 = J1;
        this.J2 = J2;
    }

    public Juego() {
    }

    public int getNumeroAdivinar() {
        return numeroAdivinar;
    }

    public void setNumeroAdivinar(int numeroAdivinar) {
        this.numeroAdivinar = numeroAdivinar;
    }

    public int getJ1() {
        return J1;
    }

    public void setJ1(int J1) {
        this.J1 = J1;
    }

    public int getJ2() {
        return J2;
    }

    public void setJ2(int J2) {
        this.J2 = J2;
    }
    
    
        
}
