//SumaGUI.java
package ch01;

import javax.swing.JOptionPane;



public class SumaGUI {
    public static void main(String[] args){
        
        
       
       int number1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero entero a sumar"));
       int number2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero entero a sumar"));
       
       int result = number1 + number2; //Sumas los dos numeros ingresados y lo guarda en el atributo result.
       
       String mensaje = "El resultado de la suma es " + result;
       
       JOptionPane.showMessageDialog(null, mensaje);
    }
}
