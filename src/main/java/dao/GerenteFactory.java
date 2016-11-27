package dao;

import moldel.Implementacao;


public class GerenteFactory {
	 
    public static GerenteDAO instancia;
 
    protected GerenteFactory() {
    }
 
    public static GerenteDAO getInstancia(Implementacao imp) {
    	
        if (instancia == null){
        	if(imp == Implementacao.lista){
        		instancia = new GerenteList();
        		System.out.println("Criada instancia GerenteList");
        	}else if( imp == Implementacao.JDBC){
        		instancia = new GerenteJDBC();
        		System.out.println("Criada instancia GerenteJDBC");
        	}else{
        		instancia = new GerenteHibernate();
        		System.out.println("Criada instancia GerenteHibernate");
        	}
        }
            
        return instancia;
    }
}
