package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
//		3. Programa que obtenga la letra del DNI a partir del número. Para ello debe
//		dividir el número entre 23(división entera), luego multiplicarlo por 23 y restar el
//		resultado del valor original. La letra asociada al número vendrá dada por este
//		resto en función de la siguiente tabla:
		
//		0 T 1 R 2 W 3 A 4 G 5 M
//		6 Y 7 F 8 P 9 D 10 X 11 B
//		12 N 13 J 14 Z 15 S 16 Q 17 V
//		18 H 19 L 20 C 21 K 22 E
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce tu DNI: ");
		int numeroDNI = sc.nextInt();
		
		
		int resto = numeroDNI - (numeroDNI / 23) * 23;
		
		
		switch (resto) {
		case 0:
			System.out.println("T");
			break;
		case 1:
			System.out.println("R");
			break;
		case 2:
			System.out.println("W");
			break;
		case 3:
			System.out.println("A");
			break;
		case 4:
			System.out.println("G");
			break;
		case 5:
			System.out.println("M");
			break;
		case 6:
			System.out.println("Y");
			break;
		case 7:
			System.out.println("F");
			break;
		case 8:
			System.out.println("P");
			break;
		case 9:
			System.out.println("D");
			break;
		case 10:
			System.out.println("X");
			break;
		case 11:
			System.out.println("B");
			break;
		case 12:
			System.out.println("N");
			break;
		case 13:
			System.out.println("J");
			break;
		case 14:
			System.out.println("Z");
			break;
		case 15:
			System.out.println("S");
			break;
		case 16:
			System.out.println("Q");
			break;
		case 17:
			System.out.println("V");
			break;
		case 18:
			System.out.println("H");
			break;
		case 19:
			System.out.println("L");
			break;
		case 20:
			System.out.println("C");
			break;
		case 21:
			System.out.println("K");
			break;
		case 22:
			System.out.println("E");
			break;
		default:
			System.out.println("INCORRECTO");
			
		}

	}

}
