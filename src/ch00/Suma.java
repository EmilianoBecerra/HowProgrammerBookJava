package ch00;
//Suma.java
//Programa que muestra la suma de dos numeros ingresados por teclado.

import java.util.Scanner; //Se importa la clase Scanner de la API java.util de java.

public class Suma 
{
    public static void main( String[] args )
    {
       //Crea objeto Scanner para obtener la entrada desde la ventana de comando
       Scanner input = new Scanner(System.in);
       
       int number1;
       int number2;
       int result;
       
       System.out.print( "Escccriba el primer numero entero a sumar: " );
       number1 = input.nextInt();
       
       System.out.print( "Escriba el segundo numero entero a sumar: " );
       number2 = input.nextInt();
       
       result = number1 + number2; //Sumas los dos numeros ingresados y lo guarda en el atributo result.
       
       System.out.printf( "La suma es %d.\n", result);
    }//Fin metodo main.
}//Fin clase Suma.
