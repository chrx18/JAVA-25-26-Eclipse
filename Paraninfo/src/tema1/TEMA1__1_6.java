package tema1;

import java.util.Scanner;

public class TEMA1__1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		double media;
		int nota1, nota2;
		
		System.out.println("Introduce el valor de la nota 1: ");
		
		nota1 = sc.nextInt();
		
		System.out.println("Introduce el valor de la nota 2: ");
		
		nota2 = sc.nextInt();
		
		media = (nota1 + nota2) / 2.0;
		
		System.out.println("La media de las notas es de: " + media);
		

	}

}
