
public class ComandoWhile {

	public static void main(String[] args) {

		/*
		 * Estrutura de repeti��o While - repete quando a condi��o for verdadeira
		 */
		
		int numero = 0;
		
		while (numero <= 10) {
			System.out.println("O N�mero atual � = " + numero);
			// numero = numero + 1;
			numero++;
		}
		
		/*
		 * Estrutura de repetido��o Do While - Executa e depois verifica a condi��o
		 */
		
		int numero2 = 0;
		
		do {
			System.out.println("O N�mero atual � = " + numero2);
			numero2++;
		} while (numero2 <= 10);
	}

}
