package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// T1. Programa que lea números hasta que se den cinco ceros y escriba después la
//		suma de los números leídos.
//		Introduciendo: 1 3 5 0 4 0 6 7 –1 0 0 8 0
//		Da como salida: 33
		
		Scanner sc = new Scanner (System.in);
		int numero;
		int suma = 0;
		int contadorCeros = 0;
		
		while (contadorCeros != 5) {
			System.out.println("Introduce un número: ");
			numero = sc.nextInt();
			
			if (numero == 0) {
				contadorCeros++;
			} else {
				suma += numero;
			}
		}
		
		System.out.println("La suma de los números es de: " + suma);
		
	}

}
