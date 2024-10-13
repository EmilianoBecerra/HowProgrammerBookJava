//TravelCalculator.java
//Ingresar datos sobre el viaje y la cantidad de persona para dividir el
// costo del mismo.
package ch00;

import java.util.Scanner;

public class TravelCalculator {

    public static void main(String[] args) {
        float totalKm,
                oilPrice,
                averageLiterKm,
                parkingPrice,
                tollPrice,
                oilPerDay,
                oilPriceDay,
                totalCost,
                totalCostPerPeople;
        int totalPeople;
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese kilometos totales del viaje: ");
        totalKm = input.nextFloat();

        System.out.print("Ingrese el precio del litro de combustible: ");
        oilPrice = input.nextFloat();

        System.out.print("Ingrese el promedio de consumo de combustible, en litros, por kilometro: ");
        averageLiterKm = input.nextFloat();

        System.out.print("Ingrese el precio de estacionamiento: ");
        parkingPrice = input.nextFloat();
        
        System.out.print("Ingrese el precio de peaje: ");
        tollPrice = input.nextFloat();
        
        System.out.print("Ingrese la cantidad de personas que viajan con usted: ");
        totalPeople = input.nextInt();
        
        if(totalPeople == 0){
            totalPeople = 1;
        }
        
        oilPerDay = totalKm * averageLiterKm;
        oilPriceDay = oilPerDay * oilPrice;
        
        totalCost = oilPriceDay + parkingPrice + tollPrice;
        
        totalCostPerPeople = totalCost / totalPeople;
        
        System.out.printf("El total a pagar es de: %f\n", totalCost);
        System.out.printf("El total a pagar cada persona es de: %f\n", totalCostPerPeople);

    }
}
