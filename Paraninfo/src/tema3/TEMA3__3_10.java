package tema3;

public class TEMA3__3_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int suma = 0;
		
		for (int i = 1; i <= 10; i++) {
			int impar = 2 * i - 1;
			suma += impar;
		}
		
		System.out.println("La suma de los 10 primeros numeros impares es: " + suma);
	}

}
