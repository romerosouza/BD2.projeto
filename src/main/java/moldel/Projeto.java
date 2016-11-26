package moldel;

import java.util.ArrayList;
import java.util.List;


public class Projeto {
	
	private int idProjeto;
	private String titulo;
	private String descricao;
	private Professor responsavel;
	private String dataInicio;
	private String dataFim;
	private Area area;
	private List <Link> linkes;
	private List <Aluno> alunos;
	private List <Tecnologia> tecnologias;
	
	public Projeto(int idProjeto,Professor responsavel, String titulo, String descricao, String dataInicio, String dataFim, Area area) {
		
		this.idProjeto = idProjeto;
		this.responsavel = responsavel;
		this.titulo = titulo;
		this.descricao = descricao;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.area = area;
		linkes = new ArrayList<Link>();
		alunos = new ArrayList<Aluno>();
		tecnologias = new ArrayList<Tecnologia>();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataFim() {
		return dataFim;
	}

	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public List<Link> getLink() {
		return linkes;
	}

	public void addLink(Link link) {
		linkes.add(link);
	}

	public List<Aluno> getAluno() {
		return alunos;
	}

	public void addAluno(Aluno aluno) {
		if (aluno.getPeiriodo() < 4){
			System.out.println("O aluno não pode participar");
		}else{
			alunos.add(aluno);
		}	
	}

	public List<Tecnologia> getTecnologia() {
		return tecnologias;
	}

	public void addTecnologia(Tecnologia tecnologia) {
		tecnologias.add(tecnologia);
	}

	public int getIdProjeto() {
		return idProjeto;
	}

	public Professor getResponsavel() {
		return responsavel;
	}

	@Override
	public String toString() {
		return "Projeto [idProjeto=" + idProjeto + ", titulo=" + titulo
				+ ", descricao=" + descricao + ", responsavel=" + responsavel.getNome()
				+ ", dataInicio=" + dataInicio + ", dataFim=" + dataFim
				+ ", area=" + area + ", link=" + linkes + ", aluno=" + alunos
				+ ", tecnologia=" + tecnologias + "]";
	}
	
}
