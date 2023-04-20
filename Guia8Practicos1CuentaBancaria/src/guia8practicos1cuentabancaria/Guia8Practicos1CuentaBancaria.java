
package guia8practicos1cuentabancaria;

import java.util.Scanner;

public class Guia8Practicos1CuentaBancaria {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        CuentaBancariaServicio cuentaA = new CuentaBancariaServicio();
        System.out.println("--------------------");
        System.out.println("bienvenido al Cajero");
        System.out.println("--------------------");
        CuentaBancaria cuenta1 = cuentaA.crearCuenta();
       int opcion =0;
       do{
        System.out.println("--------------------------");
        System.out.println("elija una opcion:");
        System.out.println("1. EXTRACION RAPIDA");
        System.out.println("2. EXTRACCION");
        System.out.println("3. INGRESAR DINERO");
        System.out.println("4. CONSULTA DE SALDO");
        System.out.println("5. INFORMACION DEL USUARIO");
        System.out.println("6. SALIR");
        System.out.println("---------------------------");
        opcion  = leer.nextInt();
        switch (opcion){
            case 1:
                cuentaA.retirarDineroRapido(cuenta1);
                break;
            case 2:
                cuentaA.retirarDinero(cuenta1);
                break;
            case 3:
                cuentaA.ingresarDinero(cuenta1);
                break;
            case 4:
                cuentaA.mostrarSaldo(cuenta1);
                break;
            case 5:
                cuentaA.mostrarDatos(cuenta1);
                break;
            case 6:
                System.out.println("gracias por visitar el bancoGiendo");
                break;
            default:
                System.out.println("opcion incorrecta");
                opcion = 5;
        }
       }while(opcion < 6);
    }
}
