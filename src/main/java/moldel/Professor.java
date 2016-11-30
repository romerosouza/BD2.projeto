package moldel;

import dao.ProfessorDAO;

public class Professor implements ProfessorDAO{
	
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

	public int getMatriculaProfessor() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}
	
	public Projeto getProjeto(){
		return projeto;
	}

	public void removeProjeto(Projeto projeto){
		this.projeto = null;
	}

	public void criarProjeto(Projeto projeto) {
		// TODO Auto-generated method stub
		if (isOcupado()){
			System.out.println("O professor " + this.nome + " já participa de um projeto");
		}else{
			this.setOcupado(true);
			this.projeto = projeto;
		}	
	}

	public void addAluno(Aluno aluno) {
		// TODO Auto-generated method stub
		
	}

	public void addTecnologia(Tecnologia tecnologia) {
		// TODO Auto-generated method stub
		projeto.addTecnologia(tecnologia);
		
	}

	public void addLink(Link link) {
		// TODO Auto-generated method stub
		projeto.addLink(link);
	}

	
	@Override
	public String toString() {
		return "Professor [idProfessor=" + matricula + ", nome=" + nome
				+ ", ocupado=" + ocupado + "]";
	}
}
