package cursojava.classes;

public class Executavel {

	public static void main(String[] args) {

		/*
		 * Criando um objeto do tipo Aluno
		 */
		
		// new Aluno() � uma instancia (Cria��o de objeto)
		// aluno1 � uma referencia para o objeto Aluno
		Aluno aluno1 = new Aluno(); 
		aluno1.setIdade(27);
		
		/*Disciplina disciplina = new Disciplina();
		disciplina.setNota1(10);
		disciplina.setNota2(10);
		aluno1.setDisciplina(disciplina); */
		
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Informatica");
		disciplina.setNota(10);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Banco de dados");
		disciplina2.setNota(10);
		
		// Adicionando objeto na lista
		aluno1.getDisciplinas().add(disciplina);
		aluno1.getDisciplinas().add(disciplina2);
		
		
		System.out.println("Lista de disciplinas" + aluno1.getDisciplinas().remove(0)); // remove o item da lista atrav�s do index
		
		System.out.println("A m�dia do aluno � " + aluno1.getMediaNota());

		
		System.out.println(aluno1.toString()); // toString mostra a descri��o do objeto na mem�ria
		
		Aluno aluno2 = new Aluno("Joao");
		
		Aluno aluno3 = new Aluno("Carlos", 30);
		
		
		//**************************************************************************************************************************************
		
		/*
		 * Equals e hashCode (Diferenciar e comparar objetos)
		 */
		//Sem o uso do Equals e hashCode os objetos s�o diferentes mas contem o mesmo valor, para verificar se os objetos tamb�m s�o iguais
		// � necess�rio criar o Equals e hashCode
		
		Aluno aluno4 = new Aluno();
		aluno4.setIdade(27);
		
		if (aluno1.equals(aluno4)) {
			System.out.println("Igual");
		} else {
			System.out.println("Diferente");
		}
		
		//**************************************************************************************************************************************
		
		
	}

}
