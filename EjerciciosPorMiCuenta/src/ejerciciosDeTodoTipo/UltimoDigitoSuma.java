package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class UltimoDigitoSuma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);

		System.out.println("Introduce un número: ");
		int num1 = sc.nextInt();
		
		System.out.println("Introduce otro número: ");
		int num2 = sc.nextInt();
		
		
		int suma = num1 + num2;
		

		int ultimoDigSuma = suma % 10;
		
		System.out.println("El resultado de la suma es: " + suma);
		System.out.println("El último dígito de la suma es: " + ultimoDigSuma);
		
	}

}
