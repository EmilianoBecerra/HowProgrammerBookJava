//Multiplicacion
//Calcula e imprime el producto de tres enteros.
package ch00;

import java.util.Scanner;

public class Multiplicacion {
    public static void main( String[] args ){
        Scanner input = new Scanner(System.in);
        
        int number1;
        int number2;
        int number3;
        int result;
        
        System.out.print( "Introduzca un numero entero: " );
        number1 = input.nextInt();
        
        System.out.print( "Introduzca un segundo numero entero: " );
        number2 = input.nextInt();
        
        System.out.print( "Introduzca un tercer numero entero: " );
        number3 = input.nextInt();
        
        result = number1 * number2 * number3;
        
        System.out.printf( "La multiplicacion de %d, %d, %d es: %d.\n", number1, number2, number3, result );
    }
}
