package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class ComprobarSumaDigitosNumeroParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int numero, digito, suma = 0;
		
		System.out.println("Introduce un número: ");
		numero = sc.nextInt();
		
		
		while (numero > 0) {
			digito = numero % 10;
			suma += digito;
			numero /= 10;
		}
		
		System.out.println("La suma de los digitos es " + suma);
		
		if (suma % 2 == 0) {
			System.out.println("La suma es par");
		} else {
			System.out.println("La suma es impar");
		}
		
	}

}
