package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class ContadorDigitosMayor5Numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int numero, digito, contadorMayorCinco = 0;
		
		System.out.println("Introduce un número: ");
		numero = sc.nextInt();
		
		while (numero > 0) {
			digito = numero % 10;
			if (digito > 5) {
				contadorMayorCinco++;
			}
			numero /= 10;
		}
		
		System.out.println("Los dígitos mayores que 5 son: " + contadorMayorCinco);
		
	}

}
