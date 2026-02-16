package examen20Febrero;

public class SumarParesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] numeros = {1,2,3,4,5,6,7,8,9,10};
		int suma = 0;
		
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				suma += numeros[i];
			}
		}
		
		System.out.println(suma);
	}

}
	