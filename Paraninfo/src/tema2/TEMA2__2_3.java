package tema2;

import java.util.Scanner;

public class TEMA2__2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un número: ");
		
		int num1 = sc.nextInt();
		
		System.out.println("Introduce otro número: ");
		
		int num2 = sc.nextInt();
		
		
		if (num1 > num2) {
			
			System.out.println(num1 + " es mayor que " + num2);
		} else {
			System.out.println(num2 + " es mayor que " + num1);
		}
		
		

	}

}
