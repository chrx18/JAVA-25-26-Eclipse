package bucleWhile;

import java.util.Scanner;

public class Pedir5NumerosYSumar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int numero;
		int suma = 0;
		int contador = 0;
		
		while (contador < 5) {
			System.out.println("Introduce un número: ");
			numero = sc.nextInt();
			
			suma += numero;
			contador ++;
		}
		
		System.out.println("La suma de los números es de: " + suma);
		
	}

}
