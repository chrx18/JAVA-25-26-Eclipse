package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// 2. Programa que lea 5 números y diga cuántos son múltiplos de 3, cuántos
		//		múltiplos de 5 y cuántos no están incluidos en ninguno de los grupos anteriores.
		//
		//		Introduciendo: 1 20 5 18 15
		//		Da como salida: 2 múltiplos de 3
		//		3 múltiplos de 5
		//
		//		1 no son múltiplos de nada

		Scanner sc = new Scanner (System.in);

		int numero;
		int multiploDe3 = 0;
		int multiploDe5 = 0;
		int multiploDeNada = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.println("Introduce un número: ");
			numero = sc.nextInt();

			if (numero % 3 == 0) {
				multiploDe3++;
			}

			if (numero % 5 == 0) {
				multiploDe5++;
			}

			if (numero % 3 != 0 && numero % 5 != 0){
				multiploDeNada++;
			}
		}

		System.out.println(multiploDe3 + " multiplos de 3");
		System.out.println(multiploDe5 + " multiplos de 5");
		System.out.println(multiploDeNada + " multiplos de nada");
	}

}
