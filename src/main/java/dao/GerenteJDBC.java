package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import moldel.Aluno;
import moldel.Projeto;
import moldel.Tecnologia;
import connection.FabricaDeConexoes;


public class GerenteJDBC implements GerenteDAO {
	
	public GerenteJDBC(){}

	public void adicionarProjeto(Projeto projeto) {
		
		try{
			Connection c = FabricaDeConexoes.getConexao();
			
			System.out.println("pegou conexão");
			
			String sqlProjeto = ("insert into projetos (idprojeto, titulo, descricao, datainicio, datafim, area, matriculaprofessor) values (?, ?, ?, ?, ?, ?, ?)");
			String sqlTecnologia = ("insert into tecnologias (idtecnologia, nome, titulo, link, descricao, idprojeto) values (?, ?, ?, ?, ?, ?)");
			
			
			PreparedStatement stm = c.prepareStatement(sqlProjeto);
			
			System.out.println("Preparou o statment");
			
			stm.setInt(1, projeto.getIdProjeto());
			stm.setString(2, projeto.getTitulo());
			stm.setString(3, projeto.getDescricao());
			stm.setString(4, projeto.getDataInicio());
			stm.setString(5, projeto.getDataFim());
			stm.setString(6, projeto.getArea().name());
			stm.setInt(7, projeto.getResponsavel().getIdProfessor());
			
			System.out.println("carregou o stm");
			System.out.println(sqlProjeto);
			
			stm.executeUpdate();
			
			System.out.println("executou o stm");

			
			
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("***Erro ao conectar***");
		}finally{
			FabricaDeConexoes.fechaConexao();
		}
	}

	public void removeProjeto(int id) {
		try {
			Connection c = FabricaDeConexoes.getConexao();
			String sql = "delete from projetos where idprojeto = ?";
			PreparedStatement pst = c.prepareStatement(sql);
			pst.setInt(1, id);
			pst.executeUpdate();
			
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("***Erro ao conectar***");
		}finally{
			FabricaDeConexoes.fechaConexao();
		}
		
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

	public Tecnologia getTecnologia(String titulo) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Projeto> getProjetoAluno(int matricula) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Aluno> getAlunosProjeto(String tituloProjeto) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
