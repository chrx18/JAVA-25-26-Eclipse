package tema1;

import java.util.Scanner;

public class TEMA1__1_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un número: ");
		
		int numero = sc.nextInt();
		
		boolean esPar = (numero % 2) == 0;
		
		System.out.println("El numero es par: " + esPar);
		
		

	}

}
