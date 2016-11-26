package dao;

import java.util.ArrayList;
import java.util.List;

import moldel.Projeto;


public class GerenteList implements GerenteDAO {

	private List<Projeto> projetos = new ArrayList<Projeto>();

	
	public void adicionarProjeto(Projeto projeto) {
		projetos.add(projeto);
		System.out.println("Projeto adicionado");

	}

	public Projeto getProjeto(int id) {
		return projetos.get(id);
	}

	public void removeProjeto(int id) {
		projetos.remove(id);

	}

	public void atualizaProjeto(int id, Projeto projeto) {
		projetos.add(id, projeto);

	}

	public List<Projeto> getTodosProjetos() {
		return projetos;
	}

}
