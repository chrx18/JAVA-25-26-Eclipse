package ejercicioExpresiones;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Realiza un programa que nos pida cuantos segundos duro un concierto, 
		// y nos calcule cuantas horas, minutos y segundos son
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce segundos de duración: ");
		
		int totalSegundos = sc.nextInt();
		
		int horas = totalSegundos/ 3600;
		
		int minutos = (totalSegundos % 3600) / 60;
		
		int segundos = totalSegundos % 60;
		
		System.out.println("El concierto duró: " + horas + "h" + minutos + "min" + segundos + "seg");

	}

}
