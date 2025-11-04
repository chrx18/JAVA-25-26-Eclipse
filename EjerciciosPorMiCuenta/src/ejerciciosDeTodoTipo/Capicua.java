package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class Capicua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);	
	
		int numero, numeroOriginal, reverso = 0, resto;
		
		System.out.println("Introduce un número para saber si es capicúa: ");
		numero = sc.nextInt();
		
		
		numeroOriginal = numero;
		
		
		while (numero > 0) {
			resto = numero % 10;
			reverso = reverso * 10 + resto;
			numero = numero / 10;
		}
		
		if (numeroOriginal == reverso) {
			System.out.println("El numero es CAPICUA");
		} else {
			System.out.println("El numero NO es capicua");
		}
		
	}

}
