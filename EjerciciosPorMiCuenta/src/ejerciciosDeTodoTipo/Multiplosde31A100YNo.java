	package ejerciciosDeTodoTipo;
	
	public class Multiplosde31A100YNo {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	
			int contadorMultiplo3 = 0, contadorNoMultiplo3 = 0;
			
			for (int i = 1; i <= 100; i++) {
				
				if (i % 3 == 0) {
					contadorMultiplo3++;
				} else {
					contadorNoMultiplo3++;
				}
				
			}
			
				System.out.println("Multiplos de 3: " + contadorMultiplo3);
				System.out.println("No multiplos de 3: " + contadorNoMultiplo3);
			
		}
	
	}