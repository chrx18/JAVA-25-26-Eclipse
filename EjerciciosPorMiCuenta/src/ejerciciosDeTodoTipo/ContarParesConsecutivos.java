package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class ContarParesConsecutivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int numero, contadorParSeguido = 0, digitoActual, digitoAnterior;
		
		System.out.println("Introduce un número: ");
		numero = sc.nextInt();
		
		digitoAnterior = numero % 10;
		numero /= 10;
		
		while (numero > 0) {

			digitoActual = numero % 10;
			
			if (digitoAnterior % 2 == 0 && digitoActual % 2 == 0) {
				contadorParSeguido++;
			}
			
			digitoAnterior = digitoActual;
			
			numero /= 10;
		}
		
		System.out.println("El número tiene " + contadorParSeguido + " dígitos pares seguidos");
		

	}

}
