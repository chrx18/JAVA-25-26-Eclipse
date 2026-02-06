package examen20Febrero;

public class EliminarVocalesStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder();
		
		String texto = "Hola a Todos";

		
		for (int i = 0; i < texto.length(); i++) {
			char original = texto.charAt(i);
			char c = Character.toLowerCase(original);
			
			if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
				sb.append(original);
			}
			
		}
		
		System.out.println(sb);
		
	}

}
