package connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class FabricaDeConexoes {

	private static final String DRIVER = "org.postgresql.Driver";
	private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
	private static final String USER = "postgres";
	private static final String PSW = "123";
	
	private static Connection conexao;
	
	public static Connection getConexao() throws Exception{
		
		if (conexao == null){
			try {
				Class.forName(DRIVER);
				return DriverManager.getConnection(URL, USER, PSW);
				
            } catch (SQLException e) {
            	throw new RuntimeException("Houve um erro ao conectar com o Banco de Dados.", e);
            }catch (ClassNotFoundException e) {
            	throw new RuntimeException("Não há banco de dados.", e);
			}
		}
		return conexao;
	}
	
	public static void fechaConexao(){
		try{
			if (conexao != null){
				conexao.close();
				System.out.println("Conexão encerrada!");
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
