package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class PedirContarDigitoConcreto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int numero, contadorNumero = 0, numeroPedido, digito;
		
		System.out.println("Introduce un número: ");
		numero = sc.nextInt();
		
		System.out.println("Que digito quieres evaluar?: ");
		numeroPedido = sc.nextInt();
		
		
		while (numero > 0) {
			digito = numero % 10;
			if (digito == numeroPedido) {
				contadorNumero++;
			}
			numero /= 10;
		}
		
		System.out.println("El número " + numeroPedido +  " se ha repetido " + contadorNumero + " veces");
	}

}
