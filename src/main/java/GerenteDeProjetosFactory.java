
public class GerenteDeProjetosFactory {
	
	public static GerenteDeProjetosDAO criaInstancia(Persistencia conexao){
		
		if(conexao.name().equals("lista")){
			System.out.println("testes lista");
			return new ListGerenteDeProjetosDAO();
		}else{
			System.out.println("testes jdbc");
			return new JDBCGerenteDeProjetosDAO();
		}
	}
}
