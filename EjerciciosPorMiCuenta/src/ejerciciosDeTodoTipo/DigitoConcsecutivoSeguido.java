package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class DigitoConcsecutivoSeguido {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int numero, digitoActual, digitoAnterior;
		int contador = 1;

		System.out.println("Introduce un número: ");
		numero = sc.nextInt();

		digitoAnterior = numero % 10;
		numero /= 10;

		while (numero > 0) {
			digitoActual = numero % 10;

			if (digitoActual == digitoAnterior) {
				contador++;
			} else {
				if (contador > 1) {
					System.out.println("El dígito " + digitoAnterior +
							" se repite " + contador + " veces seguidas");
				}
				contador = 1;
			}

			digitoAnterior = digitoActual;
			numero /= 10;
		}

		if (contador > 1) {
			System.out.println("El dígito " + digitoAnterior +
					" se repite " + contador + " veces seguidas");
		}
	}
}
