
public class GerenteDeProjetosFactory {
	
	public static GerenteDeProjetosDAO criaInstancia(Implementacao imp){
		
		if(imp.name().equals("lista")){
			System.out.println("testes lista");
			return new ListGerenteDeProjetosDAO();
			
		}if (imp.name().equals("JDBC")){
			System.out.println("testes jdbc");
			return new JDBCGerenteDeProjetosDAO();
			
		}else{
			System.out.println("testes hibernate");
			return new HibernateGerenteDeProjetosDAO();
		}
	}
}
