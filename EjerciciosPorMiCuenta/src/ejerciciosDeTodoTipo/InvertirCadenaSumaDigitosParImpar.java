package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class InvertirCadenaSumaDigitosParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int numero, digito, suma = 0, invertido = 0, cadenaOriginal;
		
		System.out.println("Introduce un número: ");
		numero = sc.nextInt();
		
		
		cadenaOriginal = numero;
		
		while (numero > 0) {
			digito = numero % 10;
			invertido = invertido * 10 + digito;
			suma += digito;
			numero /= 10;
		}
		
		
		
		
		System.out.println("La suma de los dígitos es de: " + suma);

		if (suma % 2 == 0) {
			System.out.println("La suma de los números es par");
		} else {
			System.out.println("La suma de los números es impar");
		}

		System.out.println("La cadena invertida es: " + invertido);
		
		
	}

}
