package ejercicioExpresiones;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Prepara un programa que pide por teclado un número entero entre 0 y
		// 99999, y lo escribe del revés.
		// Teclea un número: 65741
		// Del revés es: 14756
		
		
		Scanner sc = new Scanner (System.in);
		
		int num, unidades, decenas, centenas, unidadesDeMillar, decenasDeMillar;
		
		System.out.println("Introduce un número: ");
		num = sc.nextInt();
		sc.close();
	
		unidades = num % 10;
		decenas = (num / 10) % 10;
		centenas = (num / 100) % 10;
		unidadesDeMillar = (num / 1000) % 10;
		decenasDeMillar = num / 10000;
		
		System.out.println("" + unidades + decenas + centenas + unidadesDeMillar + decenasDeMillar); //EL "" ES PARA QUE NO LO DETECTE COMO UNA SUMA
		
	}

}
