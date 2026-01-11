package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class TablaMultiplicarCuadrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int numero;
		
		
		System.out.println("Introduce un número: ");
		numero = sc.nextInt();

		
		for(int i = 1; i <= numero; i++) {
			for (int j = 1; j <= numero; j++) {
				System.out.print(i * j + " ");
			}
			
			System.out.println();
		}
	}

}
