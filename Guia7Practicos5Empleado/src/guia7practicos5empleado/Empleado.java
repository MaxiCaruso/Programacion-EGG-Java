
package guia7practicos5empleado;

import java.util.Scanner;


public class Empleado {
    
    private String nombre;
    private int edad;
    private int salario;

    public Empleado(String nombre, int edad, int salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    public void cargaDatos(){
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese nombre");
        nombre = leer.nextLine();
        System.out.println("ingrese edad");
        edad = leer.nextInt();
        System.out.println("ingrese salario");
        salario = leer.nextInt(); 
    }

    public double calcularAumento(){
        double sueldoAumentado = 0;
        if (edad > 30) {
            sueldoAumentado = salario * 1.1;
        }else {
            sueldoAumentado = salario * 1.05;
        }
        return sueldoAumentado;
    }
    
    
    
    
}
