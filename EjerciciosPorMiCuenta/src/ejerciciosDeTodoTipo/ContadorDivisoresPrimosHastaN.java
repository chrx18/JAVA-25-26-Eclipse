package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class ContadorDivisoresPrimosHastaN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int numero, contadorDivisores = 0, totalPrimos = 0;

		System.out.println("Introduce hasta que numero verificar: ");
		numero = sc.nextInt();

		for (int i = 0; i <= numero; i++) {
			for (int j = 1; j <= i; j++) {

				if (i % j == 0) {
					contadorDivisores++;
					System.out.println(j + " ");
				}
			}
		}

		if (contadorDivisores == 2) {	
			System.out.println("→ Es primo");
			totalPrimos++; 
		} else {
			System.out.println("→ No es primo");
		}

		System.out.println("Total de números primos entre 1 y " +  ": " + totalPrimos);


	}

}
