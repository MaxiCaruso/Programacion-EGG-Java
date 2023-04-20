/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class NIFServicio {
    Scanner leer = new Scanner(System.in);
    char[] letra = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};    
    // arreglo de 22 posiciones, se autodefine al cargarle los datos
    
    public NIF crearNIF(){
        System.out.println("ingrese dni");
        long dni = leer.nextLong();
        int posicion = (int)(dni % 23);// colocamos (int) ( dni % 23) para que me lo devuelva como int, ya que dni es long
        return new NIF(dni,letra[posicion]);
    }
    
    public void mostrarNIF(NIF usuario){
        System.out.println("el NIF es:" + usuario.getDni() + "-" + usuario.getLetra());
    }
    
    
}
