package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class VecesApareceDigitoEnNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int numero, digito, contadorDigito = 0, numeroPedido;
		
		System.out.println("Introduce un número: ");
		numero = sc.nextInt();
		
		System.out.println("Qué numero quieres evaluar?: ");
		numeroPedido = sc.nextInt();
		
		
		while (numero > 0) {
			digito = numero % 10;
			if(digito == numeroPedido) {
				contadorDigito++;
			}
			numero /= 10;
		}

		System.out.println("El número evaluado ha salido " + contadorDigito + " veces.");
		
	}

}
