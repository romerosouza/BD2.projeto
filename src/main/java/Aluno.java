
public class Aluno {
	private String matricula;
	private String nome;
	private int peiriodo;
	public Aluno(String matricula, String nome, int peiriodo) {
		this.matricula = matricula;
		this.nome = nome;
		this.peiriodo = peiriodo;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPeiriodo() {
		return peiriodo;
	}
	public void setPeiriodo(int peiriodo) {
		this.peiriodo = peiriodo;
	}
	@Override
	public String toString() {
		return nome;
	}
}
