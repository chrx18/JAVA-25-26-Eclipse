package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class ContarcCambiosDeParidad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int numero, digitoActual, digitoAnterior, cambioDeParidad = 0;
		
		System.out.println("Introduce un número: ");
		numero = sc.nextInt();
		
		digitoAnterior = numero % 10;
		numero /= 10;
		
		
		while (numero > 0) {
			digitoActual = numero % 10;
			
			if ((digitoActual % 2 == 0 && digitoAnterior % 2 != 0) ||
					(digitoActual % 2 != 0 && digitoAnterior % 2 == 0)) {
				
				cambioDeParidad++;
			}
			
			digitoAnterior = digitoActual;
			numero /= 10;
			
		}
		
		System.out.println("Veces que se cambia la paridad: " + cambioDeParidad);
		
	}

}
