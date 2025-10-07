package tema2;

import java.util.Scanner;

public class TEMA2__2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un número: ");
		
		int num1 = sc.nextInt();
		
		System.out.println("Introduce otro número: ");
		
		int num2 = sc.nextInt();
		
		
		int mayor = num1 > num2 ? num1 : num2;
		
		int menor = num1 < num2 ? num1 : num2;
		
		System.out.println("El numero mayor es: " + mayor);
		System.out.println("El numero menor es: " + menor);
		

	}

}
