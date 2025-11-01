package simulacroDeExamen;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Pedir numeros del uno al 99 hasta que tecleen 2 cifras iguales
		
		Scanner sc = new Scanner (System.in);

		int numero, unidades, decenas;

		
		do {
			System.out.println("Introduce un numero del 1 al 99: ");
			numero = sc.nextInt();
			unidades = numero % 10;
			decenas = numero / 10;
			
		} while (unidades != decenas);
		
		System.out.println("Fin del bucle");
	}

}
