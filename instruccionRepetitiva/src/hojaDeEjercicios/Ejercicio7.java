package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int numero, mayor = 0;
		
		System.out.println("Introduce un número: ");
		numero = sc.nextInt();
		
		while (numero != 0) {
			if (numero > mayor) {
				mayor = numero;
			}
			
		}
		
		System.out.println("El numero mayor es: " + mayor);
		
	}

}
