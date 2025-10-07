package simpleYDoble;

import java.util.Scanner;

public class DiaDeLaSemana {

	public static void main(String[] args) {
	// Pedimos un dia del 1 al 7 y ponemos en letras el día que corresponde
    // Si pongo un número raro me avisará
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un número (1-7): ");
		int dia = sc.nextInt();
		
		if (dia == 1) {
			System.out.println("Lunes");
		} else if (dia == 2) {
			System.out.println("Martes");
		} else if (dia == 3) {
			System.out.println("Miercoles");
		} else if (dia == 4) {
			System.out.println("Jueves");
		} else if (dia == 5) {
			System.out.println("Viernes");
		} else if (dia == 6) {
			System.out.println("Sabado");
		} else if (dia == 7) {
			System.out.println("Domingo");
		} else {
			System.out.println("Numero no valido");
		}
		

	}

}
