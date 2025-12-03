	package ejerciciosDeTodoTipo;
	
	public class ContadorInvertido {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			StringBuilder sb = new StringBuilder();
			
			for (int i = 10; i >= 1; i--) {
				sb.append(i).append(" ");
			}
	
			sb.reverse();
			
			System.out.println(sb);
			
		}
	
	}
