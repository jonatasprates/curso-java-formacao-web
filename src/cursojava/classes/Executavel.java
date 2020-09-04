package cursojava.classes;

public class Executavel {

	public static void main(String[] args) {

		/*
		 * Criando um objeto do tipo Aluno
		 */
		
		// new Aluno() é uma instancia (Criação de objeto)
		// aluno1 é uma referencia para o objeto Aluno
		Aluno aluno1 = new Aluno(); 
		
		
		Aluno aluno2 = new Aluno("Joao");
		
		Aluno aluno3 = new Aluno("Carlos", 30);
	}

}
