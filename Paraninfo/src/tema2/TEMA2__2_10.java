package tema2;

import java.util.Scanner;

public class TEMA2__2_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int nota;
		
		System.out.println("Introduce la nota(0-10): ");
		nota = sc.nextInt();
		
		
		switch(nota) {
		
		case 0,1,2,3,4 ->
		System.out.println("Insuficiente");
		case 5 ->
		System.out.println("Suficiente");
		case 6 ->
		System.out.println("Bien");
		case 7,8 ->
		System.out.println("Notable");
		case 9,10 ->
		System.out.println("Sobresaliente");
		}

	}

}
