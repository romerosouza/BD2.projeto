import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Test;


public class TesteConexao {

	@Test
	public void test() throws Exception {
				
	//new FabricaDeConexoes();
	Connection c = FabricaDeConexoes.getConexao();
	System.out.println(c.getTransactionIsolation());
		
	}

}
