import static org.junit.Assert.*;

import org.junit.Test;


public class CriaProjeto {

	@Test
	public void test() {
		
		Professor adriano = new Professor("Adriano Santos");
		Professor bruno = new Professor("Bruno de Brito");
		adriano.criarProjeto("Hibernate", "Trabalho sobre Hibernate", "05/11/2016", Area.Redes);
		
		assertEquals(adriano.getProjeto().getArea(), Area.Redes);
		assertEquals(adriano.getProjeto().getResponsavel().getNome(), "Adriano Santos");
		assertEquals(adriano.getProjeto().getResponsavel().isOcupado(), true);
		assertEquals(bruno.isOcupado(), false);
		assertEquals(adriano.isOcupado(), true);
		
		adriano.getProjeto().addAluno(new Aluno("12131312", "Romero", 8));
		adriano.getProjeto().addAluno(new Aluno("666", "Joel", 6));
		
		assertEquals(adriano.getProjeto().getAlunos().get(0).getNome(), "Romero");
		assertEquals(adriano.getProjeto().getAlunos().get(1).getNome(), "Joel");
		
		adriano.getProjeto().addLink("www.google.com");
		
		System.out.println(adriano.getProjeto());
		
	}

}
