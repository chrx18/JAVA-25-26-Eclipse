package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int numero, numeroAnterior;
		
		boolean numerosIguales;
		
		
		System.out.println("Introduce un número: ");
		numero = sc.nextInt();	
		
		while (numero >= 0) {
			if (numero == numeroAnterior && numeroAnterior != 0) {
				numerosIguales = true;
			}

			
		}
		
		
	}

}
