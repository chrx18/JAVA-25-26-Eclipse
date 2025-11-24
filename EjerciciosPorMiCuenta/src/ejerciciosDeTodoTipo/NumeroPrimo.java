package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int numero, contadorDivisores = 0;
		
		System.out.println("Introduce un número: ");
		numero = sc.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				contadorDivisores++;
			}
		}
		
		if (contadorDivisores == 2) {
			System.out.println("Es primo");
		} else {
			System.out.println("No es primo");
		}
		
	}

}
