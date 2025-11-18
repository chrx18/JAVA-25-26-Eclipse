package hojaDeEjercicios2;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int numero, resto;
		int binario = 0;
		int potencia = 1; // Este es para ir multiplicando por 10
		
		System.out.println("Introduce un número: ");
		numero = sc.nextInt();
		
		while (numero > 0) {
			resto = numero % 2;
			binario += resto * potencia;
			potencia *= 10;	// Siguiente posición decimal
			numero /= 2;
			
		}
		
		System.out.println(binario);
		
	}

}


