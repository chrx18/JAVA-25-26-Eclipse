package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class EdadValida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int edad; 
		
		do {
			
			System.out.println("Introduce tu edad: ");
			edad = sc.nextInt();
			
			if (edad >= 0 && edad <= 120) {
				System.out.println("Edad válida: " + edad);
			}
			
		} while (edad < 0 || edad > 120);

	}

}
