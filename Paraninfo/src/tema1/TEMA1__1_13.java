package tema1;

import java.util.Scanner;

public class TEMA1__1_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int nota1, nota2, nota3;
		
		double mediaDEC;
		
		int mediaENT;
		
		System.out.println("Introduce la nota 1: ");
		
		nota1 = sc.nextInt();
		
		System.out.println("Introduce la nota 2: ");
		
		nota2 = sc.nextInt();
		
		System.out.println("Introduce la nota 3: ");
		
		nota3 = sc.nextInt();
		
		
		mediaDEC = (nota1 + nota2 + nota3) / 3.0;
		
		mediaENT = (int) (mediaDEC);
		
		
		System.out.println("La media con decimales es: " + mediaDEC);

		System.out.println("La media entera es: " + mediaENT);
		
		

	}

}
