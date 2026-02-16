package examen20Febrero;

import java.util.Scanner;

public class RotarCadena {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Introduce el texto: ");
	        String texto = sc.nextLine();

	        System.out.println("Introduce las vueltas: ");
	        int vueltas = sc.nextInt();

	        StringBuilder nueva = new StringBuilder();

	        vueltas = vueltas % texto.length();

	        String finales = texto.substring(texto.length() - vueltas);

	        String inicio = texto.substring(0, texto.length() - vueltas);

	        nueva.append(finales).append(inicio);

	        System.out.println("Cadena rotada: " + nueva.toString());
	        
	}
}

