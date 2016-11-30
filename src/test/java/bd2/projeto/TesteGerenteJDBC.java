package bd2.projeto;

import moldel.Aluno;
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
		
		Professor romero = new Professor(12325, "Romero2");
		romero.criarProjeto(new Projeto(romero, "Projeto BD2", "Valendo nota", "1/2/16", "31/12/16", Area.BD));
		romero.addTecnologia(new Tecnologia(123, "Postgresql", "SGBD", "www.postgresql.com", "sem descrição"));
		romero.addTecnologia(new Tecnologia(232, "MySql", "SGBD", "www.sql.com", "banco com sql"));
		romero.addAluno(new Aluno(1280008, "Romero souza", 7));
		
		//gerente.adicionarProjeto(romero.getProjeto());
		
		//gerente.atualizaProjeto(100, new Projeto(100, romero, "Projeto aterado2", "Valendo nota", "1/2/16", "31/12/16", Area.BD));
		
		gerente.removeProjeto(9);
		
	}

}
