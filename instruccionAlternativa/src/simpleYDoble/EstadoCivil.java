package simpleYDoble;

import java.util.Scanner;

public class EstadoCivil {

	public static void main(String[] args) {
		// Programa que pida una letra del estado civil y responde poniendo la palabra que corresponda
		
//		ss soltero
//		cc casado
//		vv viudo
//		dd divoriado
		
		Scanner sc = new Scanner (System.in);
		
		char letra; 
		System.out.println("Introduce la letra de tu estado civil: ");
		letra = sc.nextLine().charAt(0); //leemos una letra del teclado
		
		if (letra == 's' || letra == 'S') {
			System.out.println("Soltero");
		} else if (letra == 'c' || letra == 'C') {
			System.out.println("Casado");
		} else if (letra == 'v' || letra == 'V') {
			System.out.println("Viudo");
		} else if (letra == 'd' || letra == 'D') {
			System.out.println("Divorciado");
		} else {
			System.out.println("Letra incorrecta");
		}
		
		/*
		 * switch (letra) {
		 * case 's':
		 *   System.out.println("Soltero");                                SE PUEDE HACER TAMBIEN CON SWITCH, BASTANTE MAS COMODO Y RAPIDO
		 *   break;
		 *   ..
		 *   ..
		 *   ..
		 */
		

	}

}
