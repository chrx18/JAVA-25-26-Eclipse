package ejercicioExpresiones;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Prepara un programa que pide por teclado tres numeros y nos dice si estan ordenados o no.	
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un número: ");
		int num1 = sc.nextInt();
		
		System.out.println("Introduce otro número: ");
		int num2 = sc.nextInt();
		
		System.out.println("Introduce otro número: ");
		int num3 = sc.nextInt();
		sc.close();
		
		boolean resultado = num1 <= num2 && num2 <= num3 || num1 >= num2 && num2 >= num3;
		
		System.out.println("Ordenados: " + resultado);
		
	}

}
