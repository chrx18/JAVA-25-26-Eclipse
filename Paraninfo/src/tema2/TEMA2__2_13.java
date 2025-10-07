package tema2;

import java.util.Scanner;

public class TEMA2__2_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce la hora: ");
		int hora = sc.nextInt();
		
		System.out.println("Introduce los minutos: ");
		int minutos = sc.nextInt();
		
		System.out.println("Introduce los segundos: ");
		int segundos = sc.nextInt();
		
		segundos ++;
		
		if (segundos > 59) {
			segundos = 0;
			minutos ++;
		}
		
		
	    if (minutos > 59) {
			minutos = 0;									
			hora ++;
			
	    }
	    
		if (hora > 23) {
			hora = 0;
			
		}
																	// Usamos los if por separado en vez de anidarlos.
																	// Esto es importante porque cada comprobación (segundos, minutos, hora)
																	// se debe hacer SIEMPRE, no solo cuando la condición anterior se cumple.
																	// Si los if estuvieran anidados, por ejemplo la comprobación de minutos
																	// solo se haría cuando antes hubieran pasado los segundos de 59, y eso
																	// provocaría errores. Así, con if independientes, cada paso se revisa
																	// siempre y el reloj funciona correctamente.
		
	    System.out.println("Hora + 1 segundo: " + hora + ":" + minutos + ":" + segundos );
	    
		}
	}
