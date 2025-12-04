package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class NumeroCreciente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int numero, digito, ultimoDigito;
		boolean creciente = true;
		
		System.out.println("Introduce un número: ");
		numero = sc.nextInt();
		
		ultimoDigito = numero % 10;
		numero /= 10;
		
		while (numero > 0) {
			digito = numero % 10;
			
			if (digito >= ultimoDigito) {
				creciente = false;
				break;	//El break aqui no es OBLIGATORIO, pero si es útil porque seguir no aportaria nada.
			}
		
			ultimoDigito = digito;
			numero /= 10;
			
		}
		
		if (creciente) {
			System.out.println("El número es creciente");
		} else {
			System.out.println("El número no es creciente");
		}
		
	}

}
