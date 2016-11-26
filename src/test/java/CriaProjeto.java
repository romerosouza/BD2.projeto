import static org.junit.Assert.*;

import org.junit.Test;


public class CriaProjeto {

	@Test
	public void test() {
		
		Professor adriano = new Professor(1, "Adriano");
		Professor bruno = new Professor(2, "Bruno");
		adriano.criarProjeto(1, "titulo", "descricao", "dataInicio", "dataFim", Area.BD);
		System.out.println(adriano.isOcupado());
		assertEquals(adriano.isOcupado(), true);
		assertEquals(bruno.isOcupado(), false);
		System.out.println(adriano.getProjeto());
		assertEquals(adriano.getProjeto().getResponsavel().getNome(), "Adriano");
		
	}

}
