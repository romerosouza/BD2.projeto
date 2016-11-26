package dao;


import java.util.List;

import moldel.Projeto;


public interface GerenteDAO {
	
	public void adicionarProjeto(Projeto projeto);
	public Projeto getProjetoTitulo(String titulo);
	public Projeto getProgetoData(String data);
	public Projeto getProjetoResponsavel(String professor);
	public void removeProjeto(int id);
	public void atualizaProjeto(int id, Projeto projeto);
	public List<Projeto> getTodosProjetos();

}
