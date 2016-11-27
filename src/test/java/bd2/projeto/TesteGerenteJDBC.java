package bd2.projeto;

import moldel.Area;
import moldel.Implementacao;
import moldel.Professor;
import moldel.Projeto;
import moldel.Tecnologia;

import org.junit.Test;

import dao.GerenteDAO;
import dao.GerenteFactory;

public class TesteGerenteJDBC {

	@Test
	public void test() {
		
		GerenteDAO gerente = GerenteFactory.getInstancia(Implementacao.JDBC);
		System.out.println(gerente.toString());
		Professor romero = new Professor(1, "Romero");
		romero.criarProjeto(new Projeto(3, romero, "titulo1", "descricao", "1/2/16", "31/12/16", Area.BD));
		romero.addTecnologia(new Tecnologia(1, "nome", "titulo", "link", "descricao"));
		
		//gerente.adicionarProjeto(romero.getProjeto());
		
		gerente.removeProjeto(1);
		
	}

}
