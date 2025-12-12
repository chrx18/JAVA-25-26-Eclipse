package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class MayorDiferenciaEntreDigitos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int numero, digitoActual, digitoAnterior, diferencia, diferenciaMayor = 0;
		
		
		System.out.println("Introduce un número: ");
		numero = sc.nextInt();
		
		digitoAnterior = numero % 10;
		numero /= 10;
		
		while (numero > 0) {
			digitoActual = numero % 10;

			diferencia = Math.abs(digitoAnterior - digitoActual);
			
			if (diferencia > diferenciaMayor) {
				diferenciaMayor = diferencia;
			}
			
			
			digitoAnterior = digitoActual;
			
			numero /= 10;
			
		}
	
		System.out.println("La mayor diferencia entre dígitos consecutivos es de: " + diferenciaMayor);
		
	}
	
}
