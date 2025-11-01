package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class FactorialDeUnNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int numero, factorial = 1;
		
		System.out.print("Introduce un numero para hacer su factorial: ");
		numero = sc.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			factorial *= i;
		}

		System.out.println("El factorial de " + numero + " es " + factorial);
	}

}
