package ejerciciosDeTodoTipo;

public class UsoDeleteBasico2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		StringBuilder sb = new StringBuilder("ABCDE");
		
		sb.delete(2, 3);  //Tambien serviria poner sb.deleteCharAt(2);
		
		System.out.println(sb);
	}

}
