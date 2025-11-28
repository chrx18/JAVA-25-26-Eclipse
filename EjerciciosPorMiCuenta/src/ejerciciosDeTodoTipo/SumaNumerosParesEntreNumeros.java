package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class SumaNumerosParesEntreNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int numInicio, numFinal, suma = 0;
		
		System.out.println("Introduce por qué número empezar: ");
		numInicio = sc.nextInt();
		
		System.out.println("Introduce por qué número acabar: ");
		numFinal = sc.nextInt();
		
		for (int i = numInicio; i <= numFinal; i++) {
			if (i % 2 == 0) {
				suma += i;
			}
		}
		
		System.out.println("La suma de los números pares " + suma);
	}

}
