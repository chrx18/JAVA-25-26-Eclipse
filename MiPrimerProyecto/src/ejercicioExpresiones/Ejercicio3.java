package ejercicioExpresiones;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/* Programa que permita teclear un número correspondiente a un año y
		calcule y visualice si es bisiesto o no. (Un año es bisiesto si es múltiplo
				de 4 y no es múltiplo de 100 o bien es múltiplo de 400). */
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un número: ");
		
		int num = sc.nextInt();
		
		
		boolean bisiesto = num % 4 == 0 && num % 100 != 0|| num % 400 == 0;
		
		System.out.println(bisiesto);
		

	}

}
