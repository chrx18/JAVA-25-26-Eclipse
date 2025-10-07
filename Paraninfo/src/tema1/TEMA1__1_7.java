package tema1;

import java.util.Scanner;

public class TEMA1__1_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		double longitud, area;
		
		double radio;
		
		System.out.println("Introduce el radio: ");
		
		radio = sc.nextDouble();
		
		longitud = 2 * Math.PI * radio;
		
		area = Math.PI * Math.pow(radio, 2);
		
		System.out.println("La longitud es: " + longitud + "\n El area es: " + area);
		
		
						
	}

}
