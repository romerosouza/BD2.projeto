package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Index;

import moldel.Aluno;
import moldel.Projeto;
import moldel.Tecnologia;


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

	public Tecnologia getTecnologia(String titulo) {
		Tecnologia tec;
		for (int i = 0; i < projetos.size(); i++) {
			for (int j = 0; j < projetos.get(i).getTecnologia().size(); j++) {
				if(projetos.get(i).getTecnologia().get(j).getNome() == titulo){
					tec = projetos.get(i).getTecnologia().get(j);
					return tec;
				}
			}
		}
		return null;
	}

	public List<Projeto> getProjetoAluno(int matricula) {
		List<Projeto> proj;
		proj = new ArrayList<Projeto>();
		
		for (int i = 0; i < projetos.size(); i++) {
			for (int j = 0; j < projetos.get(i).getAluno().size(); j++) {
				if(projetos.get(i).getAluno().get(j).getMatricula() == matricula){
					proj.add(i, projetos.get(j));
				}
			}
		}

		return null;
	}

	public List<Aluno> getAlunosProjeto(String tituloProjeto) {
		// TODO Auto-generated method stub
		return null;
	}

}
