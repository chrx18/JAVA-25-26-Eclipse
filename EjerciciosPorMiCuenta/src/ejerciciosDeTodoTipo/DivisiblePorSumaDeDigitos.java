package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class DivisiblePorSumaDeDigitos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int numero, digito, suma = 0, original;
		
		System.out.println("Introduce un número: ");
		numero = sc.nextInt();
		
		original = numero;
		
		while (numero > 0) {
			digito = numero % 10;
			suma += digito;
			numero /= 10;
		}
		
		if (original % suma == 0) {
			System.out.println("Es divisible por la suma de sus números");
		} else {
			System.out.println("No es divisible por la suma de sus números");
		}

	}

}
