package tema3;

import java.util.Scanner;

public class TEMA3__3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un número: ");
		
		int numero = sc.nextInt();
		
		
		while (numero != 0) {
			boolean esPar = numero % 2 == 0 ? true : false;
			boolean esPositivo = numero >= 0 ? true : false;
			System.out.println("Es par: " + esPar);
			System.out.println("Es positivo: " + esPositivo);
			System.out.println("El cuadrado es: " + numero * numero);
			
			System.out.println("Introduce otro número: ");
			numero = sc.nextInt();
			
		}

	}

}
