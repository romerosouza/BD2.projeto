import static org.junit.Assert.*;

import org.junit.Test;


public class TesteGereneteDeProjetos {

	@Test
	public void test() {
		
		GerenteDAO g1 = GerenteDeProjetosFactory.criaInstancia(Implementacao.JDBC);
		Professor romero = new Professor(1, "Romero");
		//Professor bruno = new Professor(2, "Bruno");
		//bruno.criarProjeto(2, "titulo 2", "descricao2", "dataInicio", "dataFim", Area.IA);
		romero.criarProjeto(1, "titulo", "descricao", "dataInicio", "dataFim", Area.BD);
		
		g1.adicionarProjeto(romero.getProjeto());
		/*g1.adicionarProjeto(bruno.getProjeto());
		
		//assertEquals(g1.getProjeto(0).getResponsavel().getNome(), "Romero");
		//assertEquals(g1.getProjeto(0).getResponsavel().isOcupado(), true);
		//assertEquals(bruno.isOcupado(), true);
		//System.out.println(g1.getProjeto(0).getResponsavel().getNome());
		//System.out.println(g1.getProjeto(0));
		//System.out.println(g1.getTodosProjetos());
		//g1.atualizaProjeto(0, bruno.getProjeto());
		*/System.out.println(g1.getTodosProjetos());
		
		
		
	}

}
