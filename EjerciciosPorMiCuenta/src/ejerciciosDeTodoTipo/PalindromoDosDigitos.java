package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class PalindromoDosDigitos {

	public static void main(String[] args) {
		// Número palíndromo de dos dígitos

		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un número de 2 dígitos: ");
		int numero = sc.nextInt();
		
		int numeroFinal = numero % 10;
		int numeroPrimero = numero / 10;
		
		if (numeroFinal == numeroPrimero) {
			System.out.println("Es palíndromo");
		} else {
			System.out.println("No es palíndromo");
		}
	}

}
