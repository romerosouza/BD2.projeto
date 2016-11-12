public class Aluno {
	private String matricula;
	private String nome;
	private int peiriodo;
	private int idProjeto;
	
	public Aluno(String matricula, String nome, int peiriodo, int idProjeto) {
		this.matricula = matricula;
		this.nome = nome;
		this.peiriodo = peiriodo;
		this.idProjeto = idProjeto;
	}

	public int getPeiriodo() {
		return peiriodo;
	}

	public void setPeiriodo(int peiriodo) {
		this.peiriodo = peiriodo;
	}

	public int getIdProjeto() {
		return idProjeto;
	}

	public void setIdProjeto(int idProjeto) {
		this.idProjeto = idProjeto;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome
				+ ", peiriodo=" + peiriodo + ", idProjeto=" + idProjeto + "]";
	}
		
}
