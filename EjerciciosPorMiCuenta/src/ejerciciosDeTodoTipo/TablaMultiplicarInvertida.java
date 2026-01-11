package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class TablaMultiplicarInvertida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un número: ");
		int numero = sc.nextInt();
		
		for (int i = 10; i >= 1; i--) {
			System.out.println(numero + " x " + i +  " = " + (numero * i));
		}

		
	}

}
