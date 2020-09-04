
public class ComandoFor {
	
	public static void main(String[] args) {
		
		/*
		 * Estrutura de Repetição For - Percorre uma lista de dados
		 */
		
		// tabuada do 2
		for (int numero = 0; numero <= 10; numero++) {
			System.out.println(numero * 2);
		}
		
		// ordem decrescente
		for (int numero = 10; numero >= 0; numero--) {
			System.out.println(numero);
		}
		
		/*
		 * Estrutura de Repetição For com Break (Parada)
		 */
		System.out.println("-----------------------------------");
		
		for (int i = 0; i <= 10; i++) {
			if (i == 7) {
				System.out.println("Obaa, encontrei o número 7 \n estou parando de executar...");
				break;
			}
		}
		
		/*
		 * Estrutura de Repetição For com Continue
		 */
		for (int x = 0; x <= 10; x++) {
			if (x == 3) {
				System.out.println("Obaa, encontrei o número 3 \n vou executar...");
				continue;
			}
		}
		
	}

}
