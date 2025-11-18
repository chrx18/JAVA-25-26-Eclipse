package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class ContarParesHasta0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int numero, contadorPar = 0;
		
		do {
			System.out.println("Introduce un número: ");
			numero = sc.nextInt();
			
			if (numero % 2 == 0) {
				contadorPar++;
			}
			
		} while (numero != 0);

		
		System.out.println("\nHas introducido " + contadorPar + " numeros pares");
	}

}
