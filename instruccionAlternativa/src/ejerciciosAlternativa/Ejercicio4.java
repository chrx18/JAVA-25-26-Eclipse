package ejerciciosAlternativa;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
//		4. Programa que nos diga si un número ha conseguido o no el reintegro en el
//		sorteo de la ONCE. Un número de cinco cifras consigue el reintegro si su
//		primera o última cifra coincide con la primera o última cifra del número
//		agraciado en el sorteo.
//
//		Introduciendo: 23745 y premiado es 29348
//		Da como salida: Si tiene reintegro
		
		final int numeroPremiado = 12345;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un numero de 5 cifras: ");
		int numeroIntroducido = sc.nextInt();

		
		int ultimonumeroINTR = numeroIntroducido % 10;
		int primernumeroINTR = numeroIntroducido / 1000;
		
		int ultimonumeroPRE = numeroPremiado % 10;
		int primernumeroPRE = numeroPremiado / 1000;
		
	if (ultimonumeroPRE == ultimonumeroINTR || primernumeroINTR == primernumeroPRE) {
		System.out.println("HAS GANADO!!!");
	} else {
		System.out.println("HAS PERDIDO");
	}

	}

}
