package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class SumaDe1AN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int numero, suma = 0;
		
		System.out.println("Introduce hasta que número quieres sumar: ");
		numero = sc.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			suma += i;
		}
		
		System.out.println("La suma es de: " + suma);
	}

}
