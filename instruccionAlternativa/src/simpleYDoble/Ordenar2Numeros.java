package simpleYDoble;

import java.util.Scanner;

public class Ordenar2Numeros {

	public static void main(String[] args) {
		// Pedir 2 numeros por teclado y los imprimimos en orden creciente
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un número: ");
		
		int num1 = sc.nextInt();
		
		System.out.println("Introduce otro número: ");
		
		int num2 = sc.nextInt();
		
		
		if (num1 > num2) {
			System.out.println(num2 + ", " + num1);
		} else {
			System.out.println(num1 + ", " + num2);
		}

	}

}
