package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class SumaParesEntreNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		
		int num1, num2, suma = 0;
		
		System.out.println("Introduce un número: ");
		num1 = sc.nextInt();
		
		System.out.println("Introduce otro número: ");
		num2 = sc.nextInt();
		
		
		for (int i = num1; i <= num2; i++) {
			if (i % 2 == 0) {
				suma += i;
			}
		}

		
		System.out.println("La suma de los números pares entre los dos numero introducidos es: " + suma);
		
	}

}
