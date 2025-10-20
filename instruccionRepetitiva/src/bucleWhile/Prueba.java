package bucleWhile;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		
//		Probamos el bucle While
//		
//		while (condicion) {
//			Instrucciones;
//		}
//		
//		
//		Probamos el bucle do-while
//		
//		do {
//			Instrucciones;
//		} while (condicion);

		
		
		
//		Pedir numeros por teclado hasta que pongan el 0
		
		Scanner sc = new Scanner(System.in);
	
		int numero;
		
		do {
			System.out.println("Introduce un número: ");
			numero = sc.nextInt();
		} while (numero != 0);
		
		System.out.println("Ya hemos acabado");
		
	}

}
