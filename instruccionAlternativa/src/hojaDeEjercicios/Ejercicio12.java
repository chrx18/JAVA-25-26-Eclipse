package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
//		12. Pedir una hora de la forma hora, minutos y segundos, y mostrar la hora en el
//		segundo siguiente.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la hora: ");
		
		int hora = sc.nextInt();
		
		System.out.println("Introduce los minutos: ");
		
		int minutos = sc.nextInt();
		
		System.out.println("Introduce los segundos: ");
		
		int segundos = sc.nextInt();
		
		segundos++;
		
		
		if (segundos == 60) {
			segundos = 0;
			minutos++;
		}
		if (minutos == 60) {
			minutos = 0;
			hora++;
		}
		if (hora == 24) {
			hora = 0;
		}

		System.out.println("La hora con 1 segundo mas es: " + hora + ": " + minutos + ": " + segundos);
	}

}
