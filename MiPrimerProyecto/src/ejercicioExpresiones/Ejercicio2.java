package ejercicioExpresiones;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/* Diseña un programa que indique si un número pasado por teclado es
		múltiplo de siete o no.*/

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un número: ");
		
		int num = sc.nextInt();
		
		
		boolean mult = num % 7 == 0;
		
		System.out.println(mult);

		
	}

}
