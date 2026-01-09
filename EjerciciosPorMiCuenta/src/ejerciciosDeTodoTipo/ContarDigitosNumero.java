package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class ContarDigitosNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int numero, digito, contadorDigitos = 0;
		
		System.out.println("Introduce un número: ");
		numero = sc.nextInt();
		
		
		while (numero > 0) {
			digito = numero % 10;
			
			contadorDigitos++;
			
			numero /= 10;
		}
		
		System.out.println("El número tiene " + contadorDigitos + " dígitos.");
		

	}

}
