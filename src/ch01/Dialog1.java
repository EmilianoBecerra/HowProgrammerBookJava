//Dialog1.java
package ch01;

import javax.swing.JOptionPane;

public class Dialog1 {
    public static void main(String[] args){
        
        String nombre = JOptionPane.showInputDialog("Cual es tu nombre?");
        
        String mensaje = String.format("Bienvenido, %s, a la programacion en Java!", nombre);
        
        JOptionPane.showMessageDialog(null,mensaje);
    }
}
