package dao;


import java.util.List;

import moldel.Aluno;
import moldel.Projeto;
import moldel.Tecnologia;


public interface GerenteDAO {
	
	public void adicionarProjeto(Projeto projeto);
	public Projeto getProjetoTitulo(String titulo);
	public Projeto getProgetoData(String data);
	public Projeto getProjetoResponsavel(String professor);
	public void removeProjeto(int id);
	public void atualizaProjeto(int id, Projeto projeto);
	public List<Projeto> getTodosProjetos();
	public Tecnologia getTecnologia (String titulo);
	public List<Projeto> getProjetoAluno(int matricula);
	public List<Aluno> getAlunosProjeto (String tituloProjeto);

}
