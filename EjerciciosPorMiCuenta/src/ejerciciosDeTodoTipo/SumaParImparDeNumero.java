package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class SumaParImparDeNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int numero, digito, sumaPar = 0, sumaImpar = 0;
		
		System.out.println("Introduce un número: ");
		numero = sc.nextInt();
		
		
		while (numero > 0) {
			digito = numero % 10;
			
			if (digito % 2 == 0) {
				sumaPar += digito;
			} else {
				sumaImpar += digito;
			}
			
			numero /= 10;
		}
		
		System.out.println("La suma de los dígitos pares es: " + sumaPar);
		System.out.println("La suma de los dígitos impares es: " + sumaImpar);
		
	}

}
