
package guia7practicos6rectangulo;

import java.util.Scanner;


public class Rectangulo {
    
    private int lado1;
    private int lado2;

    public Rectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Rectangulo() {
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    
    public void medidas(){
        System.out.println("Ingrese las medidas de los lados");
        Scanner leer = new Scanner(System.in);
        lado1 = leer.nextInt();
        lado2 = leer.nextInt();
        
    }
    
    public double calcularArea(){
        return (lado1 * lado2);
    }
    
    public void dibujarRectangulo(){
    
        for (int i = 0; i < lado1; i++) {
            for (int j = 0; j < lado2; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
        
    }
    
    
}
