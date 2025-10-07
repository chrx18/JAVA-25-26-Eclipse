package ejercicioExpresiones;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Programa que te indique cuantos billetes tiene q sacar un banco

		int dineroTotal, resto, billetes500, billetes200, billetes100, billetes50, billetes20, billetes10, billetes5;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la cantidad de euros: ");
		dineroTotal = sc.nextInt();
		
		System.out.println("La cantidad de billetes que tengo que dar es de: ");
		billetes500 = dineroTotal / 500;
		
		System.out.println("Billetes de 500: " + billetes500);
		resto = dineroTotal % 500;
		
		billetes200 = resto / 200;
		System.out.println("Billetes de 200: " + billetes200);
		resto = resto % 200;
		
		billetes100 = resto / 100;
		System.out.println("Billetes de 100: " + billetes100);
		resto = resto % 100;
		
		billetes50 = resto / 50;
		System.out.println("Billetes de 50: " + billetes50);
		resto = resto % 50;
		
		billetes20 = resto / 20;
		System.out.println("Billetes de 20: " + billetes20);
		resto = resto % 20;
		
		billetes10 = resto / 10;
		System.out.println("Billetes de 10: " + billetes10);
		resto = resto % 10;
		
		billetes5 = resto / 5;
		System.out.println("Billetes de 5: " + billetes5);
		resto = resto % 5;
		
		
		
		
		
		
	}

}
