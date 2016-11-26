
public class Professor {
	
	private int matricula;
	private String nome;
	private boolean ocupado;
	private Projeto projeto;
	
	public Professor(int matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}
	
	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	public int getIdProfessor() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}
	
	public Projeto getProjeto(){
		return projeto;
	}
	
	public void criarProjeto(int idProjeto, String titulo, String descricao, String dataInicio, String dataFim, Area area){
		Projeto projeto = new Projeto(idProjeto, this, titulo, descricao, dataInicio, dataFim, area);
		this.setOcupado(true);
		this.projeto = projeto;
	}
	
	@Override
	public String toString() {
		return "Professor [idProfessor=" + matricula + ", nome=" + nome
				+ ", ocupado=" + ocupado + "]";
	}
	
}
