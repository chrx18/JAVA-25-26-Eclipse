package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class SumaYComparativaParImparHastaN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int numero, sumaImpar = 0, sumaPar = 0;
		
		System.out.println("Introduce hasta qué número sumar: ");
		numero = sc.nextInt();
		
		for (int i = 0; i <= numero; i++) {
			if (i % 2 == 0) {
				sumaPar += i;
			} else {
				sumaImpar += i;
			}
			
		}
		
		
		if (sumaPar > sumaImpar) {
			System.out.println("La suma de los pares es mayor a la de los impares");
		} else {
			System.out.println("La suma de los impares es mayor a la de los pares");
		}
		
		System.out.println("Suma de numeros pares " + sumaPar);
		System.out.println("Suma de numeros impares " + sumaImpar);
	}

}
