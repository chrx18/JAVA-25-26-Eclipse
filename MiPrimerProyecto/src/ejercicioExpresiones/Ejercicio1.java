package ejercicioExpresiones;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int edad;
		
		System.out.println("Introduce tu edad: ");
		edad = sc.nextInt();
		
		boolean resultado = edad >= 18;
		
		System.out.println("Eres mayor de edad: " +  resultado);

	}

}
