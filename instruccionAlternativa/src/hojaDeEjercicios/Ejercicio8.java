package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un número de 0 a 99.999: ");
		int num = sc.nextInt();
		
		if (num < 10) {
			System.out.println(num);
		} else if (num < 100) {
			int unidades, decenas;
			
			unidades = num % 10;
			decenas = num / 10;
			System.out.println("" + unidades + decenas);
		} else if (num < 1000) {
			int unidades, decenas, centenas;
			
			unidades = num % 10;
			decenas = (num / 10) % 10;
			centenas = num / 100;
			System.out.println("" + unidades + decenas + centenas);
		} else if (num < 10000) {
			int unidades, decenas, centenas, unidadesDeMillar;
			
			unidades = num % 10;
			decenas = (num / 10) % 10;
			centenas = (num / 100) % 10;
			unidadesDeMillar = num / 1000;
			
			System.out.println("" + unidades + decenas + centenas + unidadesDeMillar);
		} else if (num < 100000) {
			int unidades, decenas, centenas, unidadesDeMillar, decenasDeMillar;
			
			unidades = num % 10;
			decenas = (num / 10) % 10;
			centenas = (num / 100) % 10;
			unidadesDeMillar = (num / 1000) % 10;
			decenasDeMillar = num / 10000;
			System.out.println("" + unidades + decenas + centenas + unidadesDeMillar + decenasDeMillar);
		}
	}

}
