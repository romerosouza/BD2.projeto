
import java.util.List;


public interface GerenteDeProjetosDAO {
	
	public void adicionarProjeto(Projeto projeto);
	public Projeto getProjeto(int id);
	public void removeProjeto(int id);
	public void atualizaProjeto(int id, Projeto projeto);
	public List<Projeto> getTodosProjetos();

}
