package ejerciciosDeTodoTipo;

import java.util.Scanner;

public class AlturaParqueAtracciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner sc = new Scanner(System.in);
		        int personasAtraccion = 0;
		        System.out.println("Cuantas personas van a pasar a la atraccion?: ");
		        personasAtraccion = sc.nextInt();
		        int fuera = 0;
		        int dentro = 0;
		        int altura;

		        for (int i = 1; i <= personasAtraccion; i++) {
		            System.out.println("Cuanto mide la persona " + i + " en cm?");
		            altura = sc.nextInt();
		            if (altura < 140) {
		                System.out.println("Esta persona no puede pasar, es muy bajita.");
		                fuera++;
		            } else {
		                System.out.println("Si que puede pasar, cumple con la altura.");
		                dentro++;
		            }
		        }
		        System.out.println("Pueden pasar " + dentro + " personas");
		        System.out.println("NO pueden pasar " + fuera + " personas");
	} 
}