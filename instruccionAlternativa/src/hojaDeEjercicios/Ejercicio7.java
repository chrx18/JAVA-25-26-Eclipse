package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// 7. Pedir un número entre 0 y 9.999 y decir cuántas cifras tiene.
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un numero de 0 a 99.999: ");
		
		int numero = sc.nextInt();
		
		
		if (numero < 10) {
			System.out.println("El numero tiene 1 cifra");
		} else if (numero < 100) {
			System.out.println("El numero tiene 2 cifras");
		} else if (numero < 1000) {
			System.out.println("El numero tiene 3 cifras");
		} else if (numero < 10000) {
			System.out.println("El numero tiene 4 cifras");
		} else if (numero < 100000) {
			System.out.println("El numero tiene 5 cifras");
		} else {
			System.out.println("NUMERO INCORRECTO");
		}

	}

}
