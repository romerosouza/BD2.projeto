
public class Tecnologia {
	private int idTecnologia;
	private String nome;
	private String titulo;
	private String link;
	private String descricao;
	private int idProjeto;
	
	public Tecnologia(int idTecnologia, String nome, String titulo, String link, String descricao, int idProjeto) {
		this.idTecnologia = idTecnologia;
		this.nome = nome;
		this.titulo = titulo;
		this.link = link;
		this.descricao = descricao;
		this.idProjeto = idProjeto;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getIdProjeto() {
		return idProjeto;
	}

	public void setIdProjeto(int idProjeto) {
		this.idProjeto = idProjeto;
	}

	public int getIdTecnologia() {
		return idTecnologia;
	}

	public String getNome() {
		return nome;
	}

	public String getTitulo() {
		return titulo;
	}

	@Override
	public String toString() {
		return "Tecnologia [nome=" + nome + ", titulo=" + titulo
				+ ", descricao=" + descricao + "]";
	}	
}
