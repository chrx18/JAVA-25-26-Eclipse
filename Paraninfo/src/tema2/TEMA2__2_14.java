package tema2;

import java.util.Scanner;

public class TEMA2__2_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int diasDelMes = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce dia: ");
		
		int dia = sc.nextInt();
		
		System.out.println("Introduce mes: ");
		
		int mes = sc.nextInt();
		
		System.out.println("Introduce año: ");
		
		int año = sc.nextInt();
		
		
		diasDelMes = switch(mes) {
		case 2 -> 28;
		case 4, 6, 9, 11 -> 30;
		default -> 31;
		};
		
		dia ++;
		
		if (dia > diasDelMes) {
			dia = 1;
			mes++;
			
			if (mes > 12) {
				mes = 1;
				año++;
			}
		}
		
		if (año == 0) {
			año = 1;
		}
		System.out.println(dia + "/" + mes + "/" + año);
		
	}

}
