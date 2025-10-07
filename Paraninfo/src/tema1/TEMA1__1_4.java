package tema1;

import java.util.Scanner;

public class TEMA1__1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int año, nacimiento, edad;
		
		System.out.println("Introduce el año actual: ");
		
		año = sc.nextInt();
		
		System.out.println("Introduce tu año de nacimiento: ");
		
		nacimiento = sc.nextInt();
		
		edad = año - nacimiento;
		
		System.out.println("Tu edad es: " + edad);
		
		
		
		

	}

}
