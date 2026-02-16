package examen20Febrero;

public class ConvertirAMayusculasContarCambios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int contadorCambios = 0;
		
		StringBuilder sb = new StringBuilder();
		
		String texto = "Hola a TodOs";
		
		for (int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);
			
			if (Character.isLowerCase(c)) {
				contadorCambios++;
			}
		
			c = Character.toUpperCase(c);
			sb.append(c);
			
		}

		System.out.println("Veces que ha cambiado a mayusculas: " + contadorCambios);
		System.out.println(sb);

	}

}
