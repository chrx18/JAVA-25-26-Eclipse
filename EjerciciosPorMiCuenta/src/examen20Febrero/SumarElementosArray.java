package examen20Febrero;

public class SumarElementosArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int suma = 0;
		int[] numeros = {1,2,3,4,5};

		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i];
		}
		
		System.out.println(suma);
		
	}

}
