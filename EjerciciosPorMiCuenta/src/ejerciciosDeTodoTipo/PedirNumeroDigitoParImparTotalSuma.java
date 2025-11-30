package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class PedirNumeroDigitoParImparTotalSuma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner (System.in);
		int numero, digito, contadorDigitos = 0, suma = 0, contadorPares = 0, contadorImpares = 0;
		
		System.out.println("Introduce un número: ");
		numero = sc.nextInt();
		
		while (numero > 0) {
			digito = numero % 10;
			if (digito % 2 == 0) {
				contadorPares++;
			} else {
				contadorImpares++;
			}
			suma += digito;
			numero /= 10;
			contadorDigitos++;
		}
		
		System.out.println("Hay " + contadorPares + " pares");
		System.out.println("Hay " + contadorImpares + " impares");
		System.out.println("Hay " + contadorDigitos + " digitos");
		System.out.println("La suma de los dígitos es de: " + suma);
		
	}

}
