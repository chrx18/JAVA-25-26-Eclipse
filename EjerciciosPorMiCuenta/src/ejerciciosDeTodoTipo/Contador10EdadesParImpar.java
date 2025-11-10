package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class Contador10EdadesParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int edad, contadorPar = 0, contadorImpar = 0;
		
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Introduce la edad: ");
			edad = sc.nextInt();
		
			if (edad % 2 == 0) {
				contadorPar++;
			} else {
				contadorImpar++;
			}
		}
		
		System.out.println("Contador de edad impar: " + contadorImpar);
		System.out.println("Contador de edad par: " + contadorPar);
	}

}
