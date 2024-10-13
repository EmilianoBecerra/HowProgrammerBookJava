//IMC.java
//Calculador de masa corporal.
package ch00;

import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {
        int weight;
        float height;
        float result;

        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa tu altura en centimetro: ");
        height = input.nextFloat();
        System.out.println(height);

        System.out.print("Ingresa tu peso: ");
        weight = input.nextInt();

        result = weight / (height * height);

        System.out.printf("Tu masa corporal es de: %f \n", result);

        if (result < 18.5) {
            System.out.print("Estas con bajo peso");
        } else if (result >= 18.5 && result <= 24.9) {
            System.out.print("Tu peso es normal");
        } else if (result >= 25 && result <= 29.9) {
            System.out.print("Estas con sobrepeso");
        } else {
            System.out.print("Estas obeso tio cuidate");
        }
    }
}
