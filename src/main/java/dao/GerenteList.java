package dao;

import java.util.ArrayList;
import java.util.List;

import moldel.Projeto;


public class GerenteList implements GerenteDAO {

	private List<Projeto> projetos = new ArrayList<Projeto>();

	
	public void adicionarProjeto(Projeto projeto) {
		if (projeto.getTecnologia().isEmpty()){
			System.out.println("Não é possível cadastrar um projeto sem tecnologia");
		}else{
			projetos.add(projeto);
			System.out.println("Projeto " +projeto.getTitulo() + " adicionado");
		}	
	}

	public void removeProjeto(int id) {
		projetos.get(id).getResponsavel().setOcupado(false);
		projetos.get(id).getResponsavel().removeProjeto(null);
		projetos.remove(id);

	}

	public void atualizaProjeto(int id, Projeto projeto) {
		projetos.add(id, projeto);

	}

	public List<Projeto> getTodosProjetos() {
		return projetos;
	}

	public Projeto getProjetoTitulo(String titulo) {
		for (Projeto projeto : projetos) {
			if (projeto.getTitulo()== titulo){
				return projeto;
			}
		}
		return null;
	}
	
	public Projeto getProgetoData(String data) {
		for (Projeto projeto : projetos) {
			if (projeto.getDataInicio()== data){
				return projeto;
			}
		}
		return null;
	}

	public Projeto getProjetoResponsavel(String professor) {
		for (Projeto projeto : projetos) {
			if (projeto.getResponsavel().getNome()== professor){
				return projeto;
			}
		}
		return null;
	}

}
