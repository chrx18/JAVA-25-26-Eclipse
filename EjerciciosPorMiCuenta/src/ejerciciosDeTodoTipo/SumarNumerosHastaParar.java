package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class SumarNumerosHastaParar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int suma = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		int numero = sc.nextInt();
		suma += numero;
		
		while (numero != 0) {
			
			System.out.println("Introduce un número: ");
			numero = sc.nextInt();
			suma += numero;
			System.out.println("De momento has sumado hasta el numero: " + suma);
		}
		
		System.out.println("El numero final es: " + suma);
	}

}
