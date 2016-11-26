import static org.junit.Assert.*;

import org.junit.Test;


public class adicionarValores {

	@Test
	public void test() {
		Professor romero = new Professor(1, "Romero");
		romero.criarProjeto(3, "titulo", "descricao", "dataInicio", "dataFim", Area.Redes);
		romero.getProjeto().addAluno(new Aluno(123, "Aluno", 5));
		romero.getProjeto().addTecnologia(new Tecnologia(1, "nome", "titulo", "link", "descricao"));
		romero.getProjeto().addLink(new Link(1, "www.123.com"));
		
		assertEquals(romero.getProjeto().getAluno().get(0).getNome(), "Aluno");
		assertEquals(romero.getProjeto().getTecnologia().get(0).getTitulo(), "titulo");
		
	}

}
