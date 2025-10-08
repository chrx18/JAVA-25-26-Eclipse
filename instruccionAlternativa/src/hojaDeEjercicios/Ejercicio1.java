package hojaDeEjercicios;

import java.util.Scanner;


public class Ejercicio1 {

	public static void main(String[] args) {
//	1. Diseñar un algoritmo para leer las longitudes de los lados de un triángulo (A, B,
//	C) y determinar qué tipo de triángulo es, de acuerdo a los siguientes casos.
//	Suponiendo que A es el mayor de los lados y que B y C corresponden a los otros
//	dos lados entonces:
//
//	Si A >= B+C no se trata de un triángulo
//	Si A2 = B2+C2 es triángulo rectángulo
//	Si A2 > B2+C2 triángulo obtusángulo
//	Si A2 < B2+C2 triángulo acutángulo
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce el lado A: ");
		double A = sc.nextDouble();
		
		System.out.println("Introduce el lado B: ");
		double B = sc.nextDouble();
		
		System.out.println("Introduce el lado C: ");
		double C = sc.nextDouble();
		
		
		if (A >= B + C) {
			System.out.println("NO es un triángulo");
			
		} else if (Math.pow(A, 2) == Math.pow(B, 2) + Math.pow(C, 2)) {
			System.out.println("Es un triángulo rectángulo");
			
		} else if (Math.pow(A, 2) > Math.pow(B, 2) + Math.pow(C, 2)) {
			System.out.println("Es un triángulo obtusángulo");
			
		} else if (Math.pow(A, 2) < Math.pow(B, 2) + Math.pow(C, 2)) {
			System.out.println("Es un triánglo acutángulo");

		}
		
	}

}
