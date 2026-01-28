package examen20Febrero;

public class EliminarVocales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb = new StringBuilder();
		
		String texto = "Hola a todos";
		
		for (int i = 0; i < texto.length(); i++) {
			
			char c = texto.charAt(i);
			
			if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u'
		             && c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
				sb.append(c);	
				
//				TAMBIEN SE PORDRIA HACER ASI CON CHARACTER
//				for (int i = 0; i < texto.length(); i++) {
//					char c = Character.toLowerCase(texto.charAt(i));
//
//					if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
//						sb.append(texto.charAt(i)); // añadimos el original


			}
		}
		
		System.out.println(sb.toString());
		
	}

}
