import java.sql.Connection;
import java.sql.DriverManager;


public class FabricaDeConexoes {
	
	public static Connection getConexao(){
		Connection conexao = null;
		try{
			conexao = (Connection) DriverManager.getConnection("jdbc:postgresql://localhost:5432/projetos", "postgresql", "123");
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
		return conexao;
	}
}
