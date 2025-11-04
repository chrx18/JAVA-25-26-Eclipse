package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class Fizzbuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int numero;
		
		System.out.println("Hasta que número quieres jugar?: ");
		numero = sc.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			if (i % 3 == 0 && i % 5 == 0){
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
			
		}
	}

}
