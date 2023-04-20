
package guia8practicos1cuentabancaria;

import java.util.Scanner;

public class CuentaBancariaServicio {
    private Scanner leer = new Scanner(System.in);
    
   
    public CuentaBancaria crearCuenta(){
        System.out.println("Ingrese los Datos de su Cuenta");
        System.out.println("numero de cuenta: ");
        int numeroCuenta = leer.nextInt();
        System.out.println("DNI del Cliente: ");
        long dniCliente = leer.nextLong();
        System.out.println("Saldo Actual: ");
        double saldoActual = leer.nextDouble();
      
        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
    }
    
    public void mostrarDatos(CuentaBancaria cuentaA){
        
        System.out.println("NC: " + cuentaA.getNumeroCuenta());
        System.out.println("DNI: " + cuentaA.getDniCliente());
        System.out.println("Saldo: " + cuentaA.getSaldoActual());
        
    }

    public void ingresarDinero(CuentaBancaria cuentaA){
        System.out.println("ingrese dinero a depositar");
        double deposito = leer.nextDouble();
        cuentaA.setSaldoActual(cuentaA.getSaldoActual()+deposito);
        System.out.println("su saldo ahora es: " + cuentaA.getSaldoActual());
    }
    
     public void retirarDinero(CuentaBancaria cuentaA){
        double retiroDinero;
        System.out.println("diga el monto a retirar");
        retiroDinero = leer.nextDouble();
            cuentaA.setSaldoActual(cuentaA.getSaldoActual()-retiroDinero);
            System.out.println("su saldo ahora es: " + cuentaA.getSaldoActual());
        }
        
        
    
    
    public void retirarDineroRapido(CuentaBancaria cuentaA){
        double retiroDinero;
        System.out.println("diga el monto rapido a retirar");
        retiroDinero = leer.nextDouble();
        while (retiroDinero > (cuentaA.getSaldoActual()*0.2)) {
            System.out.println("solo puede retirar en modo rapido el 20%, " + (cuentaA.getSaldoActual()*0.2) + " o menos");
            System.out.println("ingrese el monto nuevamente");
            retiroDinero = leer.nextDouble();
        }
        if (retiroDinero < (cuentaA.getSaldoActual()*0.2)) {
            cuentaA.setSaldoActual(cuentaA.getSaldoActual()-retiroDinero);
            System.out.println("su saldo ahora es: " + cuentaA.getSaldoActual());
        }
        
        
    }
    public void mostrarSaldo(CuentaBancaria cuentaA){
        
        System.out.println("Saldo: " + cuentaA.getSaldoActual());
        
    }
    
}
