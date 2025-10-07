package simpleYDoble;

import java.util.Scanner;

public class MayorDeEdad {

	public static void main(String[] args) {
		// Pedimos por teclado la edad y le decimos si puede votar
		
		//variable para guardar la edad
		byte edad;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu edad: ");
		edad = sc.nextByte();
		
		//uso una alternativa simple para decir si puede votar o no
//		
//		if (edad >= 18) {
//			System.out.println("Puede votar");
//		}
		
		//uso ahora una alternativa doble
		
		if (edad >= 18) {
			System.out.println("Puedes votar");
		} else {
			System.out.println("No puedes votar");
		}
		

	}

}
