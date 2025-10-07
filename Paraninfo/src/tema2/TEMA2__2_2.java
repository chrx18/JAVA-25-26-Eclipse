package tema2;

import java.util.Scanner;

public class TEMA2__2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		
		int num1 = sc.nextInt();
		
		System.out.println("Introduce otro número: ");
		
		int num2 = sc.nextInt();
		
		
		if (num1 == num2) {
			
			System.out.println("Los números son iguales");
		} else {
			
			System.out.println("Los números no son iguales");
		}
		
		

	}

}
