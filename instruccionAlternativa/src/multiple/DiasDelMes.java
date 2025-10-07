package multiple;

import java.util.Scanner;

public class DiasDelMes {

	public static void main(String[] args) {
		/* Pedimos un numero del 1 al 12
		 * e impreimimos la cantidad de dias que tiene el mes
		 * 
		 * 
		 * EJEMPLO: 
		 *		Teclea un numero del 1 al 12: 6
		 *				Tiene 30 dias
		 */
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un mes (1-12): ");
		
		int mes = sc.nextInt();
		
		switch (mes) {
		
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.println("Tiene 32 días");
		break;
		case 4, 6, 9, 11:
			System.out.println("Tiene 30 días");
		break;
		case 2:
			System.out.println("Tiene 28 días");
			break;
			default:
				System.out.println("No has introducido un mes correcto");
		}

	}

}
