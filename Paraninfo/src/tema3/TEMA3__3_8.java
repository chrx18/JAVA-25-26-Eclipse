package tema3;

import java.util.Scanner;

public class TEMA3__3_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int suma = 0;
		double media;
		Scanner sc = new Scanner (System.in);
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Introduce un número");
			int numero = sc.nextInt();

			suma = suma + numero;
		}
		
		media = (double) suma / 10;
		
		System.out.println("La media de las notas es de: " + media);
	}

}
