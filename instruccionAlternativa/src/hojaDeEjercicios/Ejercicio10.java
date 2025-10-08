package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// 10. Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien...
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce una nota (1-10): ");
		
		int nota = sc.nextInt();
		
		switch (nota) {
		case 1,2,3,4:
			System.out.println("Insuficiente");
		break;
		case 5:
			System.out.println("Suficiente");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7, 8:
			System.out.println("Notable");
		break;
		case 9, 10:
			System.out.println("Sobresaliente");
		break;
		default:
			System.out.println("No has introducido una nota correcta");
		}

	}

}
