	package ejercicioExpresiones;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Elabora un programa que nos pregunte nuestro peso, y calcule cuanto
		/*pesaríamos si nos vamos a vivir a la Luna. Sabemos que en la Tierra la
		gravedad en de 9.8, mientras que en la Luna es de 1.62.*/

		Scanner sc = new Scanner (System.in);
		
		
		double pesoLuna;
		System.out.println("Introduce tu peso: ");
		
		double pesoTierra = sc.nextDouble();
		
		pesoLuna = pesoTierra * (1.62/9.8);
		
		System.out.println(pesoLuna);
		
		
	}

}
