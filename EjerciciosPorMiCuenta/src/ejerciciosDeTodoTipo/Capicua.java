package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class Capicua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);	
		int numero, digito, reverso = 0, numeroOriginal = 0;

		System.out.println("Introduce un número: ");
		numero = sc.nextInt();
		
		
		numeroOriginal = numero;
		
		while (numero > 0) {
			digito = numero % 10;
			reverso = reverso * 10 + digito;
			
			numero /= 10;
		}
		
		if (reverso == numeroOriginal) {
			System.out.println("Es capicua");
		}
		else {
			System.out.println("No es capicua");
		}

	}
}