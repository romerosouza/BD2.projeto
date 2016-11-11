
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ListGerenteDeProjetosDAO implements GerenteDeProjetosDAO{
		 
	public static ListGerenteDeProjetosDAO instancia;
	private List<Projeto> projetos = new ArrayList<Projeto>();
	 
	protected ListGerenteDeProjetosDAO() {
	} 
	public static ListGerenteDeProjetosDAO getInstancia() {
		if (instancia == null)
			instancia = new ListGerenteDeProjetosDAO();
		    return instancia;
		}
	
	public void adicionarProjeto(Projeto projeto){
		if(projeto.getTecnologias().get(0).equals(null)){
			System.out.println(projeto.getResponsavel().getNome() + ", Não há nenhuma tecnologia cadastrada no seu projeto!");
		}else{
			projetos.add(projeto);
		}
	}
	
	public Projeto getProjeto(int id) {
		return projetos.get(id);
	}
	
	public void removeProjeto(int id){
		projetos.remove(id);
	}
	
	public void atualizaProjeto(int id, Projeto projeto) {
		projetos.set(id, projeto);
		
	}
	public List<Projeto> getTodosProjetos() {
		return projetos;
	}	
}
