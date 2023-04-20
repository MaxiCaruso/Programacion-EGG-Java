
package guia7practicos1;

public class Cancion {
    private String titulo;
    private String autor;
    // recibir titulo y autor como parametro y le da el valor
    Cancion (String titulo, String autor){
    this.titulo = titulo;   
    this.autor = autor;     
    }
    // inicializa las variables de los atributos como vacio
    Cancion (){
        titulo = "";
        autor = "";
    }
// lee la variable
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
// da valor a la variable , funcion leer
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
