package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class ParImparDe1AN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int numeroInicio, numeroFinal, contadorPar = 0, contadorImpar = 0;
		
		System.out.println("Introduce un número: ");
		numeroInicio = sc.nextInt();
		System.out.println("Introduce otro número: ");
		numeroFinal = sc.nextInt();
		
		
		for( int i = numeroInicio; i <= numeroFinal; i++) {
			
			if (i % 2 == 0) {
				contadorPar++;
			} else {
				contadorImpar++;
			}
		}
		
		System.out.println("Hay " + contadorPar + " pares y " + contadorImpar + " impares.");

	}

}
