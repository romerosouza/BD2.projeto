
public class Professor {
	private String nome;
	private boolean ocupado;
	private Projeto projeto;
	
	public Professor(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isOcupado() {
		return ocupado;
	}
	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
	@Override
	public String toString() {
		return "Professor [Nome: " + nome + " Ocupado: " + ocupado + "]";
	}
	
	public void criarProjeto(String titulo, String descricao, String dataInicio, Area area){
		if (this.ocupado){
			System.out.println("O professor encontra-se ocupado!!");
		}else{
			Projeto projeto = new Projeto(titulo, descricao, dataInicio, area, this);
			this.setOcupado(true);
			this.projeto = projeto;
		}	
	}
	
	public Projeto getProjeto(){
		return projeto;
	}
}
