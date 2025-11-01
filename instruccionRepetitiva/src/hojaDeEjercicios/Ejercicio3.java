package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// 3. Programa que solitite un numero n y luego muestre por pantalla la siguiente
		//		figura:
		//			1
		//			1 2
		//			1 2 3
		//			1 2 3 4
		//			1 2 3 4 5
		//			………….
		//			1 2 3 4 5 …..n

		Scanner sc = new Scanner (System.in);

		System.out.println("Introduce un número: \n");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}

	}

}
