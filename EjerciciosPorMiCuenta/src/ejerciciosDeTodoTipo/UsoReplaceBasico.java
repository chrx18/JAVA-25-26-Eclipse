package ejerciciosDeTodoTipo;

public class UsoReplaceBasico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb = new StringBuilder("Hola Juan");
		
		sb.replace(5, 9, "Pedro");
		
		System.out.println(sb);
	}

}
