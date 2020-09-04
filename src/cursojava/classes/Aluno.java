package cursojava.classes;

/*
 * Está é uma classe/objeto que representa o Aluno
 */
public class Aluno {

	/*
	 * Atributos, caracteristicas de uma classe
	 */
	String nome;
	int idade;
	String sexo;
	String dataNascimento;
	String rg;
	String cpf;
	
	/*
	 * Construtores
	 */
	
	public Aluno() {}
	
	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}
	
	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}
}
