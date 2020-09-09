package cursojava.classes;

public class Executavel {

	public static void main(String[] args) {

		/*
		 * Criando um objeto do tipo Aluno
		 */
		
		// new Aluno() é uma instancia (Criação de objeto)
		// aluno1 é uma referencia para o objeto Aluno
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
		
		
		System.out.println("Lista de disciplinas" + aluno1.getDisciplinas().remove(0)); // remove o item da lista através do index
		
		System.out.println("A média do aluno é " + aluno1.getMediaNota());

		
		System.out.println(aluno1.toString()); // toString mostra a descrição do objeto na memória
		
		Aluno aluno2 = new Aluno("Joao");
		
		Aluno aluno3 = new Aluno("Carlos", 30);
		
		
		//**************************************************************************************************************************************
		
		/*
		 * Equals e hashCode (Diferenciar e comparar objetos)
		 */
		//Sem o uso do Equals e hashCode os objetos são diferentes mas contem o mesmo valor, para verificar se os objetos também são iguais
		// é necessário criar o Equals e hashCode
		
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
