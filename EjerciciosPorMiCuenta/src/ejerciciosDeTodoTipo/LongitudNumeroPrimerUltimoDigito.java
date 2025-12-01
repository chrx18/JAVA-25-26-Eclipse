package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class LongitudNumeroPrimerUltimoDigito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int numero, digito, contadorVueltas = 0, primerDigito, ultimoDigito, original;
		
		System.out.println("Introduce un número: ");
		numero = sc.nextInt();
		
		
		original = numero;
		
		while (numero > 0) {
			digito = numero % 10;
			numero /= 10;
			contadorVueltas++;
		}

		primerDigito = original / (int)(Math.pow(10, contadorVueltas - 1)); //porque math.pow devuelve double entonces hay que convertirlo a int
		ultimoDigito = original % 10;
		
		
		System.out.println("El primer dígito es " + primerDigito);
		System.out.println("El último dígito es " + ultimoDigito);
		System.out.println("El número tiene " + contadorVueltas + " dígitos.");
		
	}

}
