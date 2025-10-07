package tema2;

import java.util.Scanner;

public class TEMA2__2_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un número del 0 al 99999: ");
		
		int num = sc.nextInt();
		
		
		if (num < 10) {
			System.out.println("El numero es de 1 cifra");
		} else if (num < 100) {
			System.out.println("El numero tiene 2 cifras");
		} else if (num < 1000) {
			System.out.println("El numero tiene 3 cifras");
		} else if (num < 10000) {
			System.out.println("El numero tiene 4 cifras");
		} else if (num < 100000) {
			System.out.println("El numero tiene 5 cifras");
		}

	}

}
