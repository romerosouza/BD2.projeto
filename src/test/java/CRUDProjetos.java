import static org.junit.Assert.*;

import org.junit.Test;


public class CRUDProjetos {

	@Test
	public void test() {
		
		GerenteDeProjetos gerente = GerenteDeProjetos.getInstancia();
		
		Professor adriano = new Professor("Adriano Santos");
		Professor bruno = new Professor("Bruno de Brito");
		
		adriano.criarProjeto("Hibernate", "Trabalho sobre Hibernate", "05/11/2016", Area.Redes);
		adriano.getProjeto().addTecnologias(new Tecnologia("Mavem", "Mavem na prática", "link", "descricao"));
		bruno.criarProjeto("JPA", "Trabalho sobre JPA", "10/12/2016", Area.IA);
		bruno.getProjeto().addTecnologias(new Tecnologia("Git", "Git na prática", "link", "descricao"));
		
		//Adicionar projeto
		gerente.addProjeto(adriano.getProjeto());
		gerente.addProjeto(bruno.getProjeto());
		
		//Listar projetos
		gerente.getProjetos();
		//System.out.println(gerente.getProjetos());
		
		gerente.getProjetosIndice();
		
		gerente.removeProjeto(0);
		//System.out.println(gerente.getProjetos());
		gerente.getProjetosIndice();
		//Editar Projeto
		gerente.editarProjeto(0);

	}

}
