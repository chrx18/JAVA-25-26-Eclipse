package tema3;

import java.util.Scanner;

public class TEMA3__3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int sumaEdades = 0, totalAlumnos = 0, mayorEdad = 0;
		
		double mediaEdades;
		
		System.out.println("Introduce la edad: ");
		
		int edad = sc.nextInt();
		
		
		while (edad > 0) {
			
			sumaEdades += edad;
			totalAlumnos++;
			if (edad >= 18) {
				mayorEdad++;
			}
			System.out.println("Introduce la edad: ");
			edad = sc.nextInt();
			
		}
		
		mediaEdades = (double) sumaEdades / totalAlumnos;
		
		System.out.println("La suma de las edades: " + sumaEdades);
		System.out.println("Total de alumnos: " + totalAlumnos);
		System.out.println("Mayores de edad: " + mayorEdad);
		System.out.println("Media de las edades: " + mediaEdades);

	}

}
