package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class UltimaCifraDoble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un número: ");

		int num = sc.nextInt();
		
		
		int dobleUltNum = (num % 10) * 2;
		
		System.out.println("El doble del último número es: " + dobleUltNum);
		
	}

}
