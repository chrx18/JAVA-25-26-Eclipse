package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class ContarDigitosMayoresQueCinco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int numero, digito, contadorM5 = 0;
		
		
		System.out.println("Introduce un número: ");
		numero = sc.nextInt();
		
		while(numero > 0) {
			digito = numero % 10;
			if (digito > 5) {
				contadorM5++;
			}
			numero /= 10;
		}
		
		System.out.println("Los dígitos mayores de 5 que hay en el número son: " + contadorM5);

	}

}
