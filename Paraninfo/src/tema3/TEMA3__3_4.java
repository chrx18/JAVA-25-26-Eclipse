package tema3;

import java.util.Scanner;

public class TEMA3__3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int etiqueta = 0;
		int etiquetaArbolMasAlto = 0;
		int alturaArbolMasAlto = 0;
		System.out.println("Introduce la altura del árbol con etiqueta " + etiqueta + ": ");	
		int altura  = sc.nextInt();

		
		while (altura != -1) {
			if (alturaArbolMasAlto < altura) {
				alturaArbolMasAlto = altura;
				etiquetaArbolMasAlto = etiqueta;
			}
			etiqueta++;
			
			System.out.println("Introduce la altura del árbol con etiqueta " + etiqueta + ": ");
		altura = sc.nextInt();
		}
		
		if (alturaArbolMasAlto == -1) {
			System.out.println("No hay árboles");
		} else {
			System.out.println("El árbol más alto mide: " + alturaArbolMasAlto);
			System.out.println("La etiqueta de ese árbol es: " + etiquetaArbolMasAlto);
		}

	}

}
