package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class NumeroPerfecto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int numero, suma = 0;
		
		
		System.out.println("Introduce un número para saber si es perfecto: ");
		numero = sc.nextInt();
		
		for (int i = 1; i < numero; i++) {
			if (numero % i == 0) {
				suma += i;
			}
		}
		
		if (suma == numero) {
			System.out.println("El número es perfecto");
		} else {
			System.out.println("El número no es perfecto");
		}
		
	}

}
