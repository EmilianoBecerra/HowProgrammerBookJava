//Cuenta.java
//
package ch01;


public class Cuenta {
    
    private double saldo;
    
    public Cuenta(double saldoInicial){
        if(saldoInicial > 0){
            saldo = saldoInicial;
        }
    }
    
    public void abonar(double monto){
        saldo = saldo + monto;
    }
    
    public void retirar(double retiro){
        if(retiro > saldo){
            System.out.println("No cuenta con ese monto de dinero");
        }else{
            saldo = saldo - retiro;
        }
        System.out.println("Se realizo el retiro, su saldo ahora es de: " + saldo);
    }
    
    public double getSaldo(){
        return saldo;
    } 
}
