package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class ContadorPositivosNegativosCeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);

		int numero, contadorPositivo = 0, contadorNegativo = 0, contadorCeros = 0;
		
		
		do {
			
			System.out.println("Introduce un número: ");
			numero = sc.nextInt();
			
			if (numero > 0 && numero < 999 && numero > 999) {
				contadorPositivo++;
			} else if (numero < 0) {
				contadorNegativo++;
			} else if (numero == 0) {
				contadorCeros++;
			}
			
			
		} while (numero != 999);
		
		System.out.println("Contador de positivos: " + contadorPositivo);
		System.out.println("Contador de negativos: " + contadorNegativo);
		System.out.println("Contador de ceros: " + contadorCeros);
	}

}
