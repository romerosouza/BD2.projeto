package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import moldel.Projeto;
import connection.FabricaDeConexoes;


public class GerenteJDBC implements GerenteDAO {

	public void adicionarProjeto(Projeto projeto) {
		
		try{
			Connection c = FabricaDeConexoes.getConexao();
			
			System.out.println("pegou conexão");
			
			String sql = ("insert into projetos (idprojeto, titulo, descricao, datainicio, datafim, area, matriculaprofessor) values (?, ?, ?, ?, ?, ?, ?)");
			
			PreparedStatement stm = c.prepareStatement(sql);
			
			System.out.println("Preparou o statment");
			
			stm.setInt(1, projeto.getIdProjeto());
			stm.setString(2, projeto.getTitulo());
			stm.setString(3, projeto.getDescricao());
			stm.setString(4, projeto.getDataInicio());
			stm.setString(5, projeto.getDataFim());
			stm.setString(6, projeto.getArea().name());
			stm.setInt(7, projeto.getResponsavel().getIdProfessor());
			
			System.out.println("carregou o stm");
			
			stm.execute();
			
			System.out.println("executou o stm");

			c.close();
			
		}catch(Exception e){
			//e.printStackTrace();
			System.out.println("***Erro ao conectar***");
		}
	}

	public void removeProjeto(int id) {
		// TODO Auto-generated method stub
		
	}

	public void atualizaProjeto(int id, Projeto projeto) {
		// TODO Auto-generated method stub
		
	}

	public List<Projeto> getTodosProjetos() {
		// TODO Auto-generated method stub
		return null;
	}

	public Projeto getProjeto(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Projeto getProjetoTitulo(String titulo) {
		// TODO Auto-generated method stub
		return null;
	}

	public Projeto getProgetoData(String data) {
		// TODO Auto-generated method stub
		return null;
	}

	public Projeto getProjetoResponsavel(String professor) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
