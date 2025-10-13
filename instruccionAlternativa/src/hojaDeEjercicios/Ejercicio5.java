package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double resultado1, resultado2; 
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce el valor de a: ");
		double a = sc.nextDouble();
		
		System.out.println("Introduce el valor de b: ");
		double b = sc.nextDouble();
		
		System.out.println("Introduce el valor de c: ");
		double c = sc.nextDouble();
		

		double discriminante = Math.pow(b,2) - 4 * a * c;


		if (discriminante > 0) {
			resultado1=(-b - Math.sqrt (discriminante)) / (2 * a); 
			resultado2=(-b + Math.sqrt (discriminante)) / ( 2 * a);
			System.out.println("Resultado 1:" + resultado1);
			System.out.println("Resultado 2:" + resultado2);
		}else if (discriminante < 0) {
			System.out.println("No existen soluciones reales");
		}else { 
			System.out.println("Solución: " + (-b / ( 2 * a )));
		}
		
	}

}
