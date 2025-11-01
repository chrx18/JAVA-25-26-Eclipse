package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class SumarNumerosHasta0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);

		int numero, suma = 0;
		do {
			
			System.out.println("Introduce un número: ");
			numero = sc.nextInt();
			suma += numero;
			
			
		} while (numero != 0);
		
		if (numero == 0) {
		}
		
		
		System.out.println("La suma de los numeros introducidos es de: " + suma);
	}

}
