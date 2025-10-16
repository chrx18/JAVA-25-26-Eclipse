package ejercicioExpresiones;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Crea un programa que pida cual es el radio de una circunferencia y nos
		// calcule cual es la longitud y el área.
		// Pido el radio
		
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce el radio de la circunferencia: ");
		
		double radio = sc.nextDouble();
		
		sc.close();
		
		//Cálculos
		
		double longitud = 2 * Math.PI * radio;
		
		double area = Math.PI * Math.pow(radio, 2);
		
		// Imprimo resultados
		
		System.out.println("Radio: " + radio);
		System.out.println("Longitud: " + longitud);
		System.out.println("Area: " + area);
		
		
		
		
		
		
		

		
		
		
		
		
		
	}

}
