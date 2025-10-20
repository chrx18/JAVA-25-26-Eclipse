package bucleFor;

import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {
		//Mostrar los numeros pares hasta el que me digan
//		Hasta que numero imprimo?: 10
//				2 4 6 8 10
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hasta que numero imprimo?: ");
		int numero = sc.nextInt();
		
		
		for (int i = 0; i <= numero; i+=2) {
			System.out.println(i);
		}
	}

}
