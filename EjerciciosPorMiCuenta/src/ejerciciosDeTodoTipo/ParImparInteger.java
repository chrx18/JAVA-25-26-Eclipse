package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class ParImparInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un número: ");
		String numero = sc.nextLine();
		
		int n = Integer.parseInt(numero); // Devuelve un int desde un String
		
		if (n % 2 == 0) { // Opero 'n' porque ya es un int y puedo comprobarlo
			System.out.println("Es par");
		} else {
			System.out.println("Es impar");
		}
	}

}
