package simpleYDoble;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		// Pedir un numero y decir si es par o impar, el cero no se considera ni par ni impar
		
		Scanner sc = new Scanner (System.in);
		
		int numero;
		
		System.out.println("Introduce un número: ");
		numero = sc.nextInt();
		
		
		
		if (numero == 0) {
			System.out.println("El cero no se considera par ni impar");
		} else if (numero % 2 == 0) {
			System.out.println("El número es par");
		} else {
			System.out.println("El número es impar");
		}

	}

}
 
			
		
