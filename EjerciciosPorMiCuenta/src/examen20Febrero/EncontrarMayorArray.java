package examen20Febrero;

public class EncontrarMayorArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeros = {1,2,3,17,4,5};
		int numeroMayor = numeros[0]; //Establezco el primer numero del array como mayor, ya que es el primero que miramos
		
		
		for (int i = 1; i < numeros.length; i++) { //Empiezo en 1 porque el primer numero ya lo he establecido como numero mayor
			
			if (numeros[i] > numeroMayor) {
				numeroMayor = numeros[i];
			}
		}
		
		System.out.println(numeroMayor);
		
 	}

}
