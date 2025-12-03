package ejerciciosDeTodoTipo;

public class InsertEnElMedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder("12345");
		int medio;
		
		medio = sb.length() / 2;
		
		sb.insert(medio, "---");
		
		
		System.out.println(sb);

	}

}
