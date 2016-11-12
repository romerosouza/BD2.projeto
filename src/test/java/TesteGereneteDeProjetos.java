import static org.junit.Assert.*;

import org.junit.Test;


public class TesteGereneteDeProjetos {

	@Test
	public void test() {
		
		GerenteDeProjetosDAO g1 = GerenteDeProjetosFactory.criaInstancia(Implementacao.lista);
		Professor romero = new Professor(1, "Romero");
		romero.criarProjeto(1, "titulo", "descricao", "dataInicio", "dataFim", Area.BD);
		romero.getProjeto().addAluno(new Aluno("123", "nome", 4,1));
		g1.adicionarProjeto(romero.getProjeto());
		System.out.println(g1.getProjeto(0).getResponsavel());
		System.out.println(g1.getProjeto(0));
		
		
	}

}
