package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class Eliminar0DeNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int numero, digito, sinCeros = 0, revertir = 0;
		
		System.out.println("Introduce un número: ");
		numero = sc.nextInt();
		
		
		while (numero > 0) {
			digito = numero % 10;
			
			if (digito != 0) {
				sinCeros = sinCeros * 10 + digito;
			}
			numero /= 10;
		}
		
		while (sinCeros > 0) {
			digito = sinCeros % 10;
			revertir = revertir * 10 + digito;
			sinCeros /= 10;
		}
		
		System.out.println("El número sin ceros es: " + revertir);
	}

}
