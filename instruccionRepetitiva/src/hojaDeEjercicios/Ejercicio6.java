package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int base, exponente;
		double resultado;
		
		System.out.println("Introduce la base: ");
		base = sc.nextInt();
		
		System.out.println("Introduce el exponente: ");
		exponente = sc.nextInt();
		
		
		if (exponente > 0) {
			resultado = 1;
			
			for (int i = 1; i <= exponente; i++) {
				resultado *= base;
			}
			System.out.println("Resultado = " + resultado);
			
		} else if (exponente < 0) {
			resultado = 1;
			exponente = Math.abs(exponente); //exponente = exponente * -1;
			for (int i = 1; i <= exponente; i++) {
				resultado *= base;
			}
			System.out.println("Resultado = " + resultado);
			
			
		} else { //el exponente es un 0
			System.out.println("Resultado = 1");
		}
		
		
	}

}
