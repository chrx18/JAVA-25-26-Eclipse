package tema3;

import java.util.Scanner;

public class TEMA3__3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int resultado, op1, op2;
		int numeroOperaciones = 0;
		
		do {
			op1 = (int) (Math.random() * 100 + 1);
			op2 = (int) (Math.random() * 100 + 1);
			System.out.println(op1 + " + " + op2 + " = " );
			resultado = sc.nextInt();
			numeroOperaciones++;
			
 		} while (resultado == op1 + op2);
		
		System.out.println("Ha conseguido realizar " + (numeroOperaciones -1) + " operaciones.");
	}

}
