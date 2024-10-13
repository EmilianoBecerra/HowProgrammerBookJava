Algoritmo sin_titulo
	Definir kmTotal, oilPrice, averageLiterKm, parkingPrice, TollDay, pricePerDay, oilPerDay, oilPriceDay, totalCost, totalCostPerPeople Como Real;
	Definir totalPeople Como Entero;
	
	Escribir "Ingrese kilometros totales";
	leer kmTotal;
	Escribir "Ingrese el precio del litro de nafta";
	leer oilPrice;
	Escribir "Ingrese el promedio de litros de consumo del auto por kilometro";
	leer averageLiterKm;
	Escribir "Ingrese el precio del estacionamiento. 0 si no gasta en estacionamiento";
	leer parkingPrice;
	Escribir "Ingrese el precio del peaje. 0 si no pago peaje";
	leer tollDAy;
	Escribir "Cantidad de personas que lo acompaña";
	leer totalPeople;
	
	si totalPeople == 0 Entonces
		totalPeople = 1;
	FinSi
	
	oilPerDay <- kmTotal * averageLiterKm;
	oilPriceDay <- oilPerDay * oilPrice;
	
	totalCost <- oilPriceDay + parkingPrice + tollDAy;
	
	totalCostPerPeople <- totalCost / totalPeople;
	
	
	
	
	Escribir "El total a pagar para cada persona es: " totalCostPerPeople;
	

FinAlgoritmo
