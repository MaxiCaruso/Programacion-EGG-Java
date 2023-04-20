
package guia7ejercicio4rectangulo;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Rectangulo {
    
    private int base;
    private int altura;
    
    // constructor que inicializa los atributos del rectangulo
    Rectangulo (int base, int altura){
        
        this.base = base;
        this.altura = altura;
        
    }

    // constructor vacio
    Rectangulo() {
        
    }

    // generamos get
    
    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }
    // generamos set

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    // metodo que crea el rectangulo dandole valores a los atributos por consola
    
    public void crearRectangulo(){
        
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la base del rectangulo");
        base = leer.nextInt();
        System.out.println("ingrese la altura del rectangulo");
        altura = leer.nextInt();
        
    }
    
    // generamos el calculo de la superficie
    public void superficieRectangulo(){
        System.out.println("la superficie es: " + (base*altura));
        
    }
    
    // generamos el calculo del perimetro
    public void perimetroRectangulo(){
        System.out.println("el perimetro es: " + ((base+altura)*2));
        
    }
    
    // dibujamos el rectangulo con asteriscos
    
    public void dibujarRectangulo() {
        
        for (int b = 0; b < base; b++) {
            for (int a = 0; a < altura; a++) {
                if (b != 0 && a != 0 && b != base-1 && a != altura-1 ) {
                    System.out.print("  ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println(" ");
        }
    }
}
