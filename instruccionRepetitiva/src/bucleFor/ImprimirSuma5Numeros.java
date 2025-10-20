package bucleFor;

import java.util.Scanner;

public class ImprimirSuma5Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int suma = 0; // esta variable se suele llamar acumulador
		Scanner sc = new Scanner (System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Introduce un número: ");
			int numero = sc.nextInt();
			suma += numero;

		}
		
		sc.close();
		
		System.out.println("La suma de los 5 números es de: " + suma);

	}

}
