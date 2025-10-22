package bucleWhile;

import java.util.Scanner;

public class SumarNumerosHasta0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int numero, suma = 0, cuenta = 0;
		
		do {
			
			System.out.println("Introduce un número: ");
			numero = sc.nextInt();
			
			suma += numero;
			cuenta ++;
		} while (numero != 0);
		
		
		System.out.println("El resultado de la suma es de: " + suma);
		System.out.println("Total de números introducidos: " + (cuenta -1));
	}

}