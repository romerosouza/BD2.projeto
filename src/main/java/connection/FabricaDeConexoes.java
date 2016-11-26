package connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class FabricaDeConexoes {

	private static String dsn = "jdbc:postgresql://localhost:5432/projetosfacisa";
	private static String user = "postgres";
	private static String psw = "123";
	
	private static Connection conexao;
	
	public static Connection getConexao() throws Exception{
		if (conexao == null){
			try {
				Class.forName("org.postgresql.Driver");
				conexao = DriverManager.getConnection(dsn, user, psw);
				System.out.println("Conexão estabelecida!");
            } catch (SQLException e) {
                System.out.println("Houve um erro ao conectar com o Banco de Dados.");
            }catch (ClassNotFoundException e) {
            	System.out.println("Não há banco de dados.");
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
