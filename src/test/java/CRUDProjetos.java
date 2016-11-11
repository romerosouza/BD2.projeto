import static org.junit.Assert.*;

import org.junit.Test;


public class CRUDProjetos {

	@Test
	public void test() {
		
		GerenteDeProjetosDAO gerente = GerenteDeProjetosFactory.criaInstancia(Persistencia.JDBC);
		
		Professor adriano = new Professor("Adriano Santos");
		Professor bruno = new Professor("Bruno de Brito");
		
		adriano.criarProjeto("Hibernate", "Trabalho sobre Hibernate", "05/11/2016", Area.Redes);
		adriano.getProjeto().addTecnologias(new Tecnologia("Mavem", "Mavem na prática", "link", "descricao"));
		bruno.criarProjeto("JPA", "Trabalho sobre JPA", "10/12/2016", Area.IA);
		bruno.getProjeto().addTecnologias(new Tecnologia("Git", "Git na prática", "link", "descricao"));
		
		//Adicionar projeto
		gerente.adicionarProjeto(adriano.getProjeto());
		gerente.adicionarProjeto(bruno.getProjeto());
		
		assertEquals(gerente.getProjeto(0).getResponsavel().getNome(), "Adriano Santos");
		assertEquals(gerente.getProjeto(0).getResponsavel().isOcupado(), true);
		//Listar projetos
		System.out.println(gerente.getTodosProjetos());
		
		System.out.println(gerente.getProjeto(1));
		
		gerente.removeProjeto(0);

	}

}
