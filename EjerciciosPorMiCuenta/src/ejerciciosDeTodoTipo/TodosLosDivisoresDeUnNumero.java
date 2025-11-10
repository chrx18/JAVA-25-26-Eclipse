package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class TodosLosDivisoresDeUnNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int numero, contadorPrimo = 0; 
		
		System.out.println("Introduce un número: ");
		numero = sc.nextInt();
		
		System.out.println("Los divisores de " + numero + " son: ");
		
		for (int i = 1; i <= numero; i++) {
			
			if (numero % i == 0) {
				System.out.println(i);
				contadorPrimo++;
			}
			
		}
		
		if(contadorPrimo > 2) {
			System.out.println("No es primo");
		} else {
			System.out.println("Es primo");
		}

	}

}