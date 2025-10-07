package tema2;

import java.util.Scanner;

public class TEMA2__2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		double a, b, c;
		
		double x1, x2, d;
		
		System.out.println("Introduce el primer coeficiente: ");
		a = sc.nextDouble();
		
		System.out.println("Introduce el segundo coeficiente: ");
		b = sc.nextDouble();
		
		System.out.println("Introduce el tercer coeficiente: ");
		c = sc.nextDouble();
		
		
		d = Math.pow(b, 2) - 4 * a  * c;
		
		if (d < 0) {
			System.out.println("El discriminante es negativo / no existen soluciones reales");
		} else {
			if (a == 0) {
				System.out.println("No es una ecuacion de segundo grado");
			} else {
				x1 = (-b + Math.sqrt(d))/(2*a);
				x2 = (-b - Math.sqrt(d))/(2*a);
				
				System.out.println("Solución 1: " + x1);
				System.out.println("Solución 2: " + x2);
			}
		}
	}

}
