package ejerciciosDeTodoTipo;

public class AlternarTextoConForSb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder("aaaaaaaaa");
		
		for (int i = 1; i <= sb.length(); i +=2) {
			sb.insert(i, "b");
		}

		System.out.println(sb);
		
		
	}

}
