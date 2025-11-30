package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class Multiplos3De1AN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int numero, contadorMultiplo3 = 0;
		
		System.out.println("Introduce hasta que número evaluar: ");
		numero = sc.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			if (i % 3 == 0) {
				contadorMultiplo3++;
			}
		}
		
		System.out.println("Hay  " + contadorMultiplo3 + " multiplos de 1 a " + numero);

	}

}
