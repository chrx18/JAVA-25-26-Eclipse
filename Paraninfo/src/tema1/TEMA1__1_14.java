package tema1;

import java.util.Scanner;

public class TEMA1__1_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número decimal: ");
		
		double num = sc.nextDouble();
		
		int red = (int) (num + 0.5);
		
		System.out.println("El numero redondeado es: " + red);
		

	}

}
