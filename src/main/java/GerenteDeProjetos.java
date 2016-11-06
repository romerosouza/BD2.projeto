import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class GerenteDeProjetos {
		 
	public static GerenteDeProjetos instancia;
	private List<Projeto> projetos = new ArrayList<Projeto>();
	 
	protected GerenteDeProjetos() {
	} 
	public static GerenteDeProjetos getInstancia() {
		if (instancia == null)
			instancia = new GerenteDeProjetos();
		    return instancia;
		}
	
	public void addProjeto(Projeto projeto){
		if(projeto.getTecnologias().get(0).equals(null)){
			System.out.println(projeto.getResponsavel().getNome() + ", Não há nenhuma tecnologia cadastrada no seu projeto!");
		}else{
			projetos.add(projeto);
		}
	}
	public List<Projeto> getProjetos() {

		return projetos;
		
	}
	public void getProjetosIndice() {
		// TODO Auto-generated method stub
		for (int i = 0; i < projetos.size(); i++) {
			System.out.println("Indice["+i+"]" + " Responsável: " + projetos.get(i).getResponsavel().getNome() + "/ Projeto: " + projetos.get(i).getTitulo());
		}
		
	}
	
	public void removeProjeto(int indice){
		projetos.remove(indice);
	}

	public Projeto editarProjeto(int indice){
		return projetos.get(indice);
	}
	
}
