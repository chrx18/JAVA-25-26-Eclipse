package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class CapicuaDeOtraForma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int numero, digito, reversa = 0, original;
		
		System.out.println("Introduce un número para saber si es capicúa: ");
		numero = sc.nextInt();
		
		original = numero; 
		
		
		while (original > 0) {
			digito = original % 10; //Asi saco el numero de la derecha
			reversa = reversa * 10 + digito; //Acumulo el digito que he seleccionado arriba en la cadena de reversa (0 * 10 + 1) = 1  (1 * 10 + siguienteNum) = 1siguienteNum
			original = original / 10; //Para ir quitando el ultimo numero del numero original y asi pasar al siguiente
		}
		
		if (numero == reversa) {
			System.out.println("El número es capicúa");
		} else {
			System.out.println("El número no es capicúa");
		}
		

	}

}
