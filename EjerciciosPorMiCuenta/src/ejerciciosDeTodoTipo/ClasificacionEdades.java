package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class ClasificacionEdades {

	public static void main(String[] args) {
//		0–12 → “Niño”
//
//		13–17 → “Adolescente”
//
//		18–64 → “Adulto”
//
//		65+ → “Anciano”
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce tu edad: ");
		int edad = sc.nextInt();
		
		if (edad >= 0 || edad <= 12) {
			System.out.println("Eres un niño");
		} else if (edad >= 13 || edad <= 17) {
			System.out.println("Eres un adolescente");
		} else if (edad >= 18 || edad <= 64) {
			System.out.println("Eres un adulto");
		} else if (edad >= 65) {
			System.out.println("Eres un anciano");
		}

	}

}
