package ejerciciosDeTodoTipo;

public class UsoStringBuilderBasicoConTodosTipos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb = new StringBuilder();
		
		sb.append("Hola");
		sb.append(" a todos");
		
		sb.insert(12, "!");
		sb.delete(4, 5);
		sb.reverse();
		
		sb.toString();
		
		
		System.out.println(sb);
	}

}
