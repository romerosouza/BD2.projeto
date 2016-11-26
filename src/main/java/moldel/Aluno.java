package moldel;

public class Aluno {
	private int matricula;
	private String nome;
	private int peiriodo;
	
	public Aluno(int matricula, String nome, int peiriodo) {
		this.matricula = matricula;
		this.nome = nome;
		this.peiriodo = peiriodo;
	}

	public int getPeiriodo() {
		return peiriodo;
	}

	public void setPeiriodo(int peiriodo) {
		this.peiriodo = peiriodo;
	}

	public int getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome
				+ ", peiriodo=" + peiriodo + "]";
	}
		
}
