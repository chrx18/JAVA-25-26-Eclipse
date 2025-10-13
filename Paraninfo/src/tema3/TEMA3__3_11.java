package tema3;

import java.util.Scanner;

public class TEMA3__3_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double factorial;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un número para saber su factorial: ");
		int numero = sc.nextInt();
		
		factorial = 1;
		
		for (int i = numero; i > 0; i--) {
			factorial = factorial * i;
		}
		
		System.out.println("El factorial de " + numero + " es " + factorial);
	}

}
