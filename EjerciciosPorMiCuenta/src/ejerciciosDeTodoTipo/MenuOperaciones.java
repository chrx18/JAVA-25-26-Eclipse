package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class MenuOperaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un número: ");
		int num1 = sc.nextInt();
		
		System.out.println("Introduce otro número: ");
		int num2 = sc.nextInt();
		
		
		System.out.println("Elige tu opción:\n1.Suma\r\n"
				+ "\r\n"
				+ "2.Resta\r\n"
				+ "\r\n"
				+ "3.Multiplicación\r\n"
				+ "\r\n"
				+ "4.División entera\r\n"
				+ "\r\n"
				+ "5.Resto");
		int opcion = sc.nextInt();
		
		
		if (opcion == 1) {
			int suma = num1 + num2;
			System.out.println("HAS ELEGIDO SUMA \nEl resultado es: " + suma);
		} else if (opcion == 2) {
			int resta = num1 - num2;
			System.out.println("HAS ELEGIDO RESTA \nEl resultado es: " + resta);
		} else if (opcion == 3) {
			int multiplicacion = num1 * num2;
			System.out.println("HAS ELEGIDO MULTIPLICIACIÓN \nEl resultado es: " + multiplicacion);
		} else if (opcion == 4) {
			int divisionEntera = num1 / num2;
			System.out.println("HAS ELEGIDO DIVISIÓN ENTERA \nEl resultado es: " + divisionEntera);
		} else if (opcion == 5) {
			int resto = num1 % num2;
			System.out.println("HAS ELEGIDO RESTO \nEl resultado es: " + resto);
		} else {
			System.out.println("No has introducido una opcion correcta");
		}
	}

}
