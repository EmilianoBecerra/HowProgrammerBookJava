//PruebaCuenta.java
package ch01;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class PruebaCuenta {

    public static void main(String[] args) {

        Cuenta cuenta1 = new Cuenta(50.00);
        Cuenta cuenta2 = new Cuenta(-7.53);

        System.out.printf("El saldo de la cuenta1 es de: %.2f\n", cuenta1.getSaldo());
        System.out.printf("El saldo de la cuenta2 es de: %.2f\n", cuenta2.getSaldo());

        Scanner input = new Scanner(System.in);
        double montoDeposito;

        System.out.print("Ingrese el monto a depositar para la cuenta1: ");
        montoDeposito = input.nextDouble();
        System.out.printf("\nSumando %.2f al saldo de la cuenta1\n\n", montoDeposito);

        cuenta1.abonar(montoDeposito);

        System.out.printf("Saldo cuenta1: %.2f\n", cuenta1.getSaldo());
        System.out.printf("Saldo cuenta2: %.2f\n", cuenta2.getSaldo());

        System.out.print("Ingrese el monto a depositar para la cuenta2: ");
        montoDeposito = input.nextDouble();
        System.out.printf("\nSumando %.2f al saldo de la cuenta2\n\n", montoDeposito);

        cuenta2.abonar(montoDeposito);

        System.out.printf("Saldo cuenta1: %.2f\n", cuenta1.getSaldo());
        System.out.printf("Saldo cuenta2: %.2f\n", cuenta2.getSaldo());
        
        double retiro = Double.parseDouble(JOptionPane.showInputDialog("Cuanto quiere retirar de la cuenta1?"));
        
        
        cuenta1.retirar(retiro);

    }
}
