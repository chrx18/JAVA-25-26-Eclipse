package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
//		4. Programa que nos diga si un número ha conseguido o no el reintegro en el
//		sorteo de la ONCE. Un número de cinco cifras consigue el reintegro si su
//		primera o última cifra coincide con la primera o última cifra del número
//		agraciado en el sorteo.
//
//		Introduciendo: 23745 y premiado es 29348zz
//		Da como salida: Si tiene reintegro
		
        int numeroPremiado = (int)(Math.random() * 90000) + 10000;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un numero de 5 cifras: ");
		int numeroIntroducido = sc.nextInt();

		
		int ultimonumeroINTR = numeroIntroducido % 10;
		int primernumeroINTR = numeroIntroducido / 10000;
		
		int ultimonumeroPRE = numeroPremiado % 10;
		int primernumeroPRE = numeroPremiado / 10000;
		
	if (numeroPremiado == numeroIntroducido) {
		System.out.println("HAS GANADO!!!!!!!!!!!!!!!!!!");
	} else if (ultimonumeroPRE == ultimonumeroINTR || primernumeroINTR == primernumeroPRE){
		System.out.println("Tienes reintegro");
	} else {
		System.out.println("Has perdido :(");
	}
		System.out.println("El numero premiado era: " + numeroPremiado);
	}

}
