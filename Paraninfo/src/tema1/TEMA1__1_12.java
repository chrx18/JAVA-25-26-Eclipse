package tema1;

import java.util.Scanner;

public class TEMA1__1_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un numero (positivo o negativo): ");
		
		int num = sc.nextInt();
		
		int vAbs = num < 0 ? -1 * num : num;     //TAMBIEN SE PODRIA USAR MATH.ABS QUE CALCULA EL VALOR ABSOLUTO
		
		System.out.println("El valor absoluto de " + num + " es: " + vAbs);
		
		
		
	}

}
