package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class CapicuaSumaParImparCerosQuitaCeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int numero, digito, original, contadorCeros = 0, suma = 0, contadorPar = 0, contadorImpar = 0, reversoCapicua = 0, revertirCadena = 0, reverso = 0, colocarReverso = 0;
		
		System.out.println("Introduce un número para evaluarlo a fondo: ");
		numero = sc.nextInt();
		
		original = numero;

		
		
		while (numero > 0) {
			digito = numero % 10;
			if (digito % 2 == 0) {
				contadorPar++; //PARES
			} else {
				contadorImpar++; //IMPARES
			}
			
			if (digito == 0) {
				contadorCeros++; //CEROS
			}
			
			reversoCapicua = reversoCapicua * 10 + digito;
			
			suma += digito; //SUMA
			
			numero /= 10;		
		}
		
		if (reversoCapicua == original) {
			System.out.println("Es capicúa");
		} else {
			System.out.println("No es capicúa"); // CAPICUA
		}

		while (original > 0) {
			digito = original % 10;
			if (digito != 0) {
				reverso = reverso * 10 + digito;
			}
			original /= 10;
		}
		
		while (reverso > 0) {
			digito = reverso % 10;
			colocarReverso = colocarReverso * 10 + digito;
			reverso /= 10;
		}
		
		
		if (suma % 2 == 0) {
			System.out.println("La suma de los dígitos es par");
		} else {
			System.out.println("La suma de los dígitos es impar");
		}
		
		System.out.println("Contador de ceros " + contadorCeros);
		System.out.println("Contador de pares " + contadorPar);
		System.out.println("Contador de impares " + contadorImpar);
		System.out.println("Suma de digitos: " + suma);
		System.out.println("El número sin ceros es: " + colocarReverso);
		
	}

}
