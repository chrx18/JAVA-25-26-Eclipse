package simulacroDeExamen;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
//		Pedir un numero y averiguar si es perfecto.
//		La suma de los divisores debe ser igual al número.

		Scanner sc = new Scanner (System.in);
		int numero, suma = 0;
		
		System.out.println("Introduce un número: ");
		numero = sc.nextInt();
		
		for (int i = 1; i < numero; i++) {
			if (numero % i == 0) {
				suma += i;
			}
		}
		
		if (suma == numero) {
			System.out.println("Es un numero perfecto");
		} else {
			System.out.println("No es un numero perfecto");
		}
		
	}

}
