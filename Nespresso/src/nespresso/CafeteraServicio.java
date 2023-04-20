
package nespresso;

import java.util.Scanner;


public class CafeteraServicio {
    Scanner leer = new Scanner(System.in);
    
    Cafetera c1 = new Cafetera(1250,0);
    // creamos un metodo que retorna void para llenar cafetera
    public void llenarCafetera(Cafetera c1){
        System.out.println("metele agua hasta: " + c1.getCapacidadMaxima());      
        c1.setCantidadActual(c1.getCapacidadMaxima()); // la llenamos hasta la cantidad de la cap maxima
        System.out.println("quedo hasta el tope rey");
}
    public void servirTaza ( Cafetera c1){
        System.out.println("¿que tamaño de taza usará?");
        int volumenTaza = leer.nextInt();
        if (c1.getCantidadActual() >= volumenTaza) {
            System.out.println("Taza llena, disfrute su cafesuli");
            c1.setCantidadActual(c1.getCantidadActual()-volumenTaza);
            System.out.println("te queda " + c1.getCantidadActual() + " mL de feca");
            
        }else{
            volumenTaza = c1.getCantidadActual();
            System.out.println("solo se pudo agregar " + volumenTaza + "mL de feca");
        } 
    }
    
    public void vaciarCafetera (Cafetera c1){
         c1.setCantidadActual(0);
        System.out.println("no te quedo ni aca de cafe");
    }
    
        public void agregarCafe (Cafetera c1){
            System.out.println("indique cafe agregado");
            int agregado = leer.nextInt();
            if ((agregado + c1.getCantidadActual()) <= c1.getCapacidadMaxima()) {
                c1.setCantidadActual(agregado+c1.getCantidadActual());
                System.out.println("Ahora tu cafetera tiene: " + c1.getCantidadActual());
            }else{
                System.out.println("no te pases fiera que la vas a romper, el limite es: " + c1.getCapacidadMaxima() + " mL de feca");
            }
        }
        
    
}
/*


 

    public void AgregarCafe(int agregado,Cafetera c1){
        if((c1.getCantidadActual()+agregado)<=c1.getCapacidadMaxima())
        {
            c1.setCantidadActual(c1.getCantidadActual()+agregado);
        }
        else
        {
            c1.setCantidadActual(c1.getCapacidadMaxima());
        }
        System.out.println("Ahora tu cafetera tiene "+c1.getCantidadActual());
        
    }
}
*/