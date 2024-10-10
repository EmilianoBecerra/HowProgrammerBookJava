//EjercicioFinDeCapitulo.java
//Respuesta pregunta de ejercicios practicos.
package ch00;

import java.util.Scanner;

public class EjerciciosFinDeCapitulo {

    public static void main(String[] args) {
        //2.8.1 - Mostar un mensaje "Escriba un entero", dejando el cursos
        //en la misma linea.
        System.out.println("Escriba un entero");

        //2.8.2 - Asignar el producto de las variables b y c a la variable a.
        int b = 10;
        int c = 20;
        int a = b * c;

        //2.15 -  Aritmetica: Obtener dos numeros entero del usuario
        // e imprimir la sumar, el producto, la difrencia y el cociente.
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;

        System.out.print("Introduzca un numero entero: ");
        number1 = input.nextInt();

        System.out.print("Introduzca otro numero entero: ");
        number2 = input.nextInt();

        if (number1 > number2) {
            System.out.printf("%d es mayor que %d\n", number1, number2);
        } else {
            System.out.printf("%d es menor que %d\n", number1, number2);
        }

        if (number1 == number2) {
            System.out.printf("%d es igual a %d\n", number1, number2);
        }

        System.out.printf("La suma entre %d y %d es: %d\n", number1, number2, (number1 + number2));

        System.out.printf("La resta entre %d y %d es: %d\n", number1, number2, (number1 - number2));

        System.out.printf("La multiplicacion entre %d y %d es: %d\n", number1, number2, (number1 * number2));

        if (number2 > 0) {
            System.out.printf("La division entre %d y %d es: %d\n", number1, number2, (number1 / number2));
        } else {
            System.out.print("No se puede dividir por 0, el resultado es Infinito");
        }
        
        
        System.out.println("-------------------------------------------------");
        
        //Imprimir diametro, circuferencia y area de un circulo
        //teniendo el valor de pi y recibiendo el radio del usuario.
        
        double pi = Math.PI;
        int radio;
        
        
        System.out.print("Introduzca el radio a calcular[Entero]: ");
        radio = input.nextInt();
        
        System.out.printf("El diametro es de: %d\n", (2 * radio));
        System.out.printf("La circunferencia es de: %f\n", (2 * pi * radio));
        System.out.printf("El area es de: %f\n", (pi * radio * radio));
    }
}
