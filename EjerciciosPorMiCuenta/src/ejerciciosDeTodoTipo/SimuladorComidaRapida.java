package ejerciciosDeTodoTipo;

import java.util.*;

public class SimuladorComidaRapida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner sc = new Scanner (System.in);

		        boolean seguirComiendo = true;
		        String siNO;
		        int cuentaPlatos = 0;
		        while (seguirComiendo) {

		            System.out.println("Elige que quieres comer (hamburguesa, pizza o ensalada: ");
		            String comida = sc.next();

		            cuentaPlatos++;
		            if (comida.equalsIgnoreCase("hamburguesa")) {
		                System.out.println("Hamburguesa en camino!!!");
		            } else if (comida.equalsIgnoreCase("pizza")) {
		                System.out.println("Pizza va!!!");
		            } else if (comida.equalsIgnoreCase("Ensalada")) {
		                System.out.println("Voy a hacerte la ensalada tio raro");
		            }
		            System.out.println("Quieres seguir comiendo?");
		            siNO = sc.next();

		            if(siNO.equalsIgnoreCase("Si")){
		                seguirComiendo = true;
		                System.out.println("Pues a elegir otro plato!");
		            } else {
		                seguirComiendo = false;
		                System.out.println("Espero que te haya gustado!!");
		            }
		        }
		        System.out.println("Has comido " + cuentaPlatos + " platos");

	}

}
