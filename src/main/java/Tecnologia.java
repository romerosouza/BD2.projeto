
public class Tecnologia {
	private String nome;
	private String titulo;
	private String link;
	private String descricao;
	public Tecnologia(String nome, String titulo, String link, String descricao) {
		this.nome = nome;
		this.titulo = titulo;
		this.link = link;
		this.descricao = descricao;
	}
	public String getNome() {
		return nome;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getLink() {
		return link;
	}
	public String getDescricao() {
		return descricao;
	}
	@Override
	public String toString() {
		return "Tecnologia [Nome: " + nome + ", Titulo: " + titulo + ", Link: "
				+ link + ", Descricao: " + descricao + "]";
	}
}
