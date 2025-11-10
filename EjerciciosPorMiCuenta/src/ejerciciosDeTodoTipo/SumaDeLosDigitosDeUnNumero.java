package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class SumaDeLosDigitosDeUnNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int numero, numeroAnterior, suma = 0, digito;
			
		System.out.println("Introduce un número: ");
		numero = sc.nextInt();
		
		while (numero > 0) {
			digito = numero % 10;
			
			suma += digito;
			
			numero /= 10;
			
		}
		
		System.out.println("La suma del número es " + suma);
		
	}

}
