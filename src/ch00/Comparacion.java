package ch00;
//Comparacion.java
//Compara enteros utilizando intrucciones if, operadores relacionales y 

import java.util.Scanner;

//de igualdad.
public class Comparacion {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1;
        int number2;

        System.out.print("Escriba un numero entero: ");
        number1 = input.nextInt();

        System.out.print("Escriba otro numero entero: ");
        number2 = input.nextInt();

        if ( number1 == number2 ) {
            System.out.printf( "%d = %d\n", number1, number2 );
        }
        
        if ( number1 != number2 ) {
            System.out.printf( "%d != %d\n", number1, number2 );
        }
        
        if( number1 < number2 ){
            System.out.printf( "%d < %d\n", number1, number2 );
        }
        
        if( number1 > number2 ){
            System.out.printf( "%d > %d\n", number1,number2 );
        }
        
        if( number1 <= number2 ) {
            System.out.printf( "%d <= %d\n", number1, number2 );
        }
        
        if( number1 >= number2 ) {
            System.out.printf( "%d >= %d\n", number1, number2 );
        }
        

    }
}
