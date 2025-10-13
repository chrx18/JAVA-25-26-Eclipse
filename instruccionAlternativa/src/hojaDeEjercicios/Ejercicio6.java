package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un día: ");
		int dia = sc.nextInt();
		
		System.out.println("Introduce un mes: ");
		int mes = sc.nextInt();
		
		System.out.println("Introduce un año: ");
		int año = sc.nextInt();
		
		sc.close();
		
		
		
		if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10) && dia == 31) {
			dia = 1;
			mes ++;
		} else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia == 30) {
			dia = 1;
			mes ++;
		} else if (mes == 2 && dia == 28) {
			dia = 1;
			mes ++;
		} else if (mes == 12 && dia == 31) {
			dia = 1;
			mes = 1;
			año ++;
		}  else if ((mes >= 1 && mes <= 12) && (dia >= 1 && dia < 28 || (mes != 2 && dia < 30) || (mes != 2 && dia < 31))) {
            dia++;
        } else {
			System.out.println("FECHA INCORRECTA");
		}
		
		
		System.out.println("La fecha con 1 dia mas es: " + año + ", " + mes + ", " + dia);
	}

}
