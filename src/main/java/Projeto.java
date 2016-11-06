import java.util.ArrayList;
import java.util.List;


public class Projeto {
	private Professor responsavel;
	private String titulo;
	private String descricao;
	private String dataInicio;
	private String dataFim;
	private Area area;
	private List<String> links;
	private List<Aluno> alunos;
	private List<Tecnologia> tecnologias;
	
	public Projeto(String titulo, String descricao, String dataInicio, Area area, Professor responsavel) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.dataInicio = dataInicio;
		this.area = area;
		links = new ArrayList<String>();
		alunos = new ArrayList<Aluno>();
		tecnologias = new ArrayList<Tecnologia>();
		this.responsavel = responsavel;
	}

	public String getDataFim() {
		return dataFim;
	}

	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}

	public List<String> getLink() {
		return links;
	}

	public void addLink(String link) {
		links.add(link);
	}

	public List<Tecnologia> getTecnologias() {
		return tecnologias;
	}

	public void addTecnologias(Tecnologia tecnologia) {
		tecnologias.add(tecnologia);
	}

	public String getTitulo() {
		return titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public Area getArea() {
		return area;
	}
	
	public Professor getResponsavel(){
		return responsavel;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}
	public void addAluno(Aluno aluno){
		if (aluno.getPeiriodo() < 4){
			System.out.println("Necessário no mínimo 4o período");
		}else{
			alunos.add(aluno);
		}	
	}

	@Override
	public String toString() {
		return "Projeto " + this.titulo + "\nResponsavel: " + responsavel.getNome() + "\nTitulo: " + titulo
				+ "\nDescricao: " + descricao + "\nData Inicio: " + dataInicio
				+ "\nData Fim: " + dataFim + "\nÁrea: " + area + "\nLinks: "
				+ links + "\nAlunos Participantes: " + alunos + "\nTecnologias: " + tecnologias + "\n\n";
	}
	
}
