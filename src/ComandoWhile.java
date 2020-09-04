
public class ComandoWhile {

	public static void main(String[] args) {

		/*
		 * Estrutura de repetição While - repete quando a condição for verdadeira
		 */
		
		int numero = 0;
		
		while (numero <= 10) {
			System.out.println("O Número atual é = " + numero);
			// numero = numero + 1;
			numero++;
		}
		
		/*
		 * Estrutura de repetidoção Do While - Executa e depois verifica a condição
		 */
		
		int numero2 = 0;
		
		do {
			System.out.println("O Número atual é = " + numero2);
			numero2++;
		} while (numero2 <= 10);
	}

}
