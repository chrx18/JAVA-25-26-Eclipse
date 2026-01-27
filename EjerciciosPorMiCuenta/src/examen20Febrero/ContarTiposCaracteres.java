package examen20Febrero;

public class ContarTiposCaracteres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String texto = "Hola123";
		
		int contadorLetras = 0;
		int contadorNumeros = 0;
		int loDemas = 0;
	
		for (int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);
			
			if (Character.isLetter(c)) {
				contadorLetras++;
			} else if (Character.isDigit(c)) {
				contadorNumeros++;
			} else {
				loDemas++;
			}
		}
		
		
		System.out.println("Letras: " + contadorLetras);
		System.out.println("Numeros: " + contadorNumeros);
		System.out.println("Lo demas: " + loDemas);

	}

}
