package dao;

import moldel.Aluno;
import moldel.Link;
import moldel.Projeto;
import moldel.Tecnologia;

public interface ProfessorDAO {

	public void criarProjeto(Projeto projeto);
	public void addAluno(Aluno aluno);
	public void addTecnologia(Tecnologia tecnologia);
	public void addLink(Link link);
		
}
