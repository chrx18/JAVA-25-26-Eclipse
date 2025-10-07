package tema2;

import java.util.Scanner;

public class TEMA2__2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un número: ");
		
		double num = sc.nextDouble();
		
		
		if (num < 0 && num > -1 || num > 0 && num < 1 ) {   // (-1 < num && num < 1 && num != 0)  tmb podria ser así
			System.out.println("El número es casi-cero");
		} else {
			
			System.out.println("El número no es un casi-cero");
		}
		
		

	}

}
