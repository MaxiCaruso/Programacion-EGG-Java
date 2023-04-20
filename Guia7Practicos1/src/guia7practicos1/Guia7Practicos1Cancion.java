
package guia7practicos1;


public class Guia7Practicos1Cancion {

    
    public static void main(String[] args) {
        // creamos variables para poder cargarlas con metodo getter
        String autor;
        String titulo;
    
        Cancion cancion1 = new Cancion();
        
        // usamos set para darle valor a las variables. el usuario no puede modificar
        cancion1.setAutor("Guns and Roses");
        cancion1.setTitulo("Paradice City");
        
        // traemos el constructor con los argumentos cargados, obviamos metodo Setter
        Cancion cancion2 = new Cancion("Un beso y una Flor", "Nino Bravo");
        
        // damos el valor a las variables con metodo get , que este toma el valor
        // del constructor de cancion2 que ya estan cargados en el codigo
        autor = cancion2.getAutor();
        titulo = cancion2.getTitulo();
        
        System.out.println(autor + " " + titulo);
     
        // usamos sout para mostrar el contenido de los getters
        System.out.println(cancion1.getAutor());
        System.out.println(cancion1.getTitulo());
        
        
        
    }
    
}
