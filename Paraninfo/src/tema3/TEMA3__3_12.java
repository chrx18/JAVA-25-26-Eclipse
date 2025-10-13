package tema3;

import java.util.Scanner;

public class TEMA3__3_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		boolean suspensos = false;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Introduce una nota: ");
			int nota = sc.nextInt();
			
			if (nota < 5) {
				suspensos = true;
			}
			
		}
		if (suspensos) {
			System.out.println("Hay alumnos suspensos");
		} else {
			System.out.println("No hay alumnos suspensos");
		}
	}

}
