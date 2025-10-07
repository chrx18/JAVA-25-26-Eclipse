package tema2;

import java.util.Scanner;

public class TEMA2__2_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce el día de la semana (0-7): ");
		int dia = sc.nextInt();
		
		switch (dia) {
		
		case 1 -> 
		System.out.println("Lunes");
		case 2 ->
		System.out.println("Martes");
		case 3 ->
		System.out.println("Miercoles");
		case 4 ->
		System.out.println("Jueves");
		case 5 -> 
		System.out.println("Viernes");
		case 6 ->
		System.out.println("Sabado");
		case 7 ->
		System.out.println("Domingo");
		}

	}

}
