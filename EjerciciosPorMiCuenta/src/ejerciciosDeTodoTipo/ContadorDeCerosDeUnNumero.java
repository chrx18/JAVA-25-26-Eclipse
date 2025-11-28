package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class ContadorDeCerosDeUnNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int numero, contadorCeros = 0, digito;
		
		System.out.println("Introduce un número: ");
		numero = sc.nextInt();
		
		while (numero > 0) {
			digito = numero % 10;
			if (digito == 0) {
				contadorCeros++;
			}
			numero /= 10;
			
		}
		
		System.out.println("Tiene " + contadorCeros + " ceros");
	}

}
