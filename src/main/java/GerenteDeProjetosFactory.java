


public class GerenteDeProjetosFactory {
	
	public static GerenteDAO criaInstancia(Implementacao imp){
		
		if(imp == Implementacao.lista){
			System.out.println("testes lista");
			return new ListGerenteDeProjetosDAO();
			
		}if (imp == Implementacao.JDBC){
			System.out.println("testes jdbc");
			return new JDBCGerenteDeProjetosDAO();
			
		}else{
			System.out.println("testes hibernate");
			return new HibernateGerenteDeProjetosDAO();
		}
	}
}
