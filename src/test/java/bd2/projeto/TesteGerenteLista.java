package bd2.projeto;

import static org.junit.Assert.*;
import moldel.Aluno;
import moldel.Area;
import moldel.Implementacao;
import moldel.Link;
import moldel.Professor;
import moldel.Projeto;
import moldel.Tecnologia;

import org.junit.Test;

import dao.GerenteDAO;
import dao.GerenteFactory;

public class TesteGerenteLista {

	@Test
	public void test() {
		//Criar a instancie de um professor
		
		Professor p1 = new Professor(1, "Romero");
		Professor p2 = new Professor(2, "Adriando");
		
		assertEquals(p1.getNome(), "Romero");
		
		//Professor CRIA um projeto
		
		p1.criarProjeto(new Projeto(p1, "titulo1", "descricao", "dataInicio", "dataFim", Area.BD));
		p1.addAluno(new Aluno(123, "nome", 5));
		p1.addTecnologia(new Tecnologia(123, "Nome", "titulo", "link", "descricao"));
		p1.addLink(new Link(123, "www.link.com"));
		
		assertEquals(p1.isOcupado(), true);
		assertEquals(p2.isOcupado(), false);
		
		p2.criarProjeto(new Projeto(p2, "titulo2", "descricao", "26/11/2016", "dataFim", Area.Cloud));
		p2.addTecnologia(new Tecnologia(2,"MAVEN","titulo2","link","descrição 2"));
		
		
		//Instanciar um gerente de projeto
		
		GerenteDAO g = GerenteFactory.getInstancia(Implementacao.lista);
		g.adicionarProjeto(p1.getProjeto());
		g.adicionarProjeto(p2.getProjeto());
		
		assertEquals(g.getProjetoTitulo("titulo1").getResponsavel().getNome(), "Romero");
		assertEquals(g.getProjetoTitulo("titulo1").getIdProjeto(), 0);
		assertEquals(g.getProjetoTitulo("titulo2").getResponsavel().getNome(), "Adriando");
		assertEquals(g.getProjetoTitulo("titulo2").getIdProjeto(), 0);
		System.out.println(g.getProjetoTitulo("titulo1").getIdProjeto());
		System.out.println(g.getProjetoTitulo("titulo2").getIdProjeto());
		
		//Remove um projero
		
		g.removeProjeto(0);
		
		assertEquals(p1.isOcupado(), false);
		
		//Atualiza um projeto
		
		g.atualizaProjeto(0, p2.getProjeto());
		assertEquals(g.getProjetoTitulo("titulo2").getIdProjeto(), 0);
		
		
		//Lista um projeto
		System.out.println(g.getProjetoTitulo("titulo2"));
		System.out.println(g.getProgetoData("26/11/2016"));
		System.out.println(g.getProjetoResponsavel("Adriando"));
		System.out.println(g.getTecnologia("MAVEN"));
		System.out.println(g.getProjetoAluno(123));
		
	}

}
