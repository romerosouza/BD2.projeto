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
			
			String sqlProfessor = ("insert into professores (matriculaprofessor, nome, ocupado) values (?, ?, ?)");
			
			PreparedStatement stmProfessor = c.prepareStatement(sqlProfessor);
			System.out.println("Preparou o statment professor");
			
			stmProfessor.setInt(1, projeto.getResponsavel().getMatriculaProfessor());
			stmProfessor.setString(2, projeto.getResponsavel().getNome());
			stmProfessor.setBoolean(3, projeto.getResponsavel().isOcupado());
			System.out.println("carregou o stm professor");
			
			stmProfessor.executeUpdate();
			System.out.println("executou o stm professor");
			
			String sqlProjeto = ("insert into projetos (titulo, descricao, datainicio, datafim, area, matriculaprofessor) values (?, ?, ?, ?, ?, ?)");
						
			PreparedStatement stmProjeto = c.prepareStatement(sqlProjeto);
			System.out.println("Preparou o statment projeto");
			
			stmProjeto.setString(1, projeto.getTitulo());
			stmProjeto.setString(2, projeto.getDescricao());
			stmProjeto.setString(3, projeto.getDataInicio());
			stmProjeto.setString(4, projeto.getDataFim());
			stmProjeto.setString(5, projeto.getArea().name());
			stmProjeto.setInt(6, projeto.getResponsavel().getMatriculaProfessor());
			
			System.out.println("carregou o stm projeto");
			
			stmProjeto.executeUpdate();
			System.out.println("executou o stm projeto");
			
			String sqlTecnologia = ("insert into tecnologias (idtecnologia, nome, titulo, link, descricao) values (?, ?, ?, ?, ?)");
			
			PreparedStatement stmTecnologia = c.prepareStatement(sqlTecnologia);
			System.out.println("Preparou o statment tecnlogia");
			
			String sqlProjetoXtecnologia = ("insert into projetoxtecnologia (idprojeto, idtecnologia) values (?, ?)");
			PreparedStatement stmProjTec = c.prepareStatement(sqlProjetoXtecnologia);
			
			try{
				for (int i = 0; i < projeto.getTecnologias().size(); i++) {
					stmTecnologia.setInt(1, projeto.getTecnologias().get(i).getIdTecnologia());
					stmTecnologia.setString(2, projeto.getTecnologias().get(i).getNome());
					stmTecnologia.setString(3, projeto.getTecnologias().get(i).getTitulo());
					stmTecnologia.setString(4, projeto.getTecnologias().get(i).getLink());
					stmTecnologia.setString(5, projeto.getTecnologias().get(i).getDescricao());
					
					stmProjTec.setInt(1, projeto.getIdProjeto());
					System.out.println("carregou o stm tecnologia");
					stmProjTec.setInt(2, projeto.getTecnologias().get(i).getIdTecnologia());
					System.out.println("carregou o stm proj X tec");
					

					stmTecnologia.executeUpdate();
					System.out.println("executou o stm tecnologia");
					stmProjTec.executeUpdate();
					System.out.println("executou o stm proj X tec");
					
				}
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
			
			String sqlAluno = ("insert into alunos (matricula, nome, periodo, idprojeto) values (?, ?, ?, ?)" );
			
			PreparedStatement stmAluno = c.prepareStatement(sqlAluno);
			System.out.println("Preparou o statment aluno");
			
			try{
				System.out.println("++++++++");
				for (int i = 0; i < projeto.getAlunos().size(); i++) {
					stmAluno.setInt(1, projeto.getAlunos().get(i).getMatricula());
					stmAluno.setString(2, projeto.getAlunos().get(i).getNome());
					stmAluno.setInt(3, projeto.getAlunos().get(i).getPeiriodo());
					stmAluno.setInt(4, projeto.getIdProjeto());
					
					System.out.println("carregou o stm aluno");

					stmAluno.executeUpdate();
					System.out.println("executou o stm aluno");
					
				}
			}catch(Exception e){
				System.out.println(e.getMessage());
			}			
			
			
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("***Erro ao conectar***");
		}finally{
			FabricaDeConexoes.fechaConexao();
			System.out.println("Conexão encerrada!");
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
		
		try{
			Connection c = FabricaDeConexoes.getConexao();
			
			System.out.println("pegou conexão");
		
			String sqlUpdate = ("UPDATE projetos SET titulo=?, descricao=?, datainicio=?, datafim=?, area=? WHERE idprojeto=?");
		 
			PreparedStatement stm = c.prepareStatement(sqlUpdate);
			stm.setString(1, projeto.getTitulo());
			stm.setString(2, projeto.getDescricao());
			stm.setString(3, projeto.getDataInicio());
			stm.setString(4, projeto.getDataFim());
			stm.setString(5, projeto.getArea().name());
			stm.setInt(6, id);
			
			int rowsUpdated = stm.executeUpdate();
			if (rowsUpdated > 0) {
				System.out.println("atualizado com sucesso!!");
			}
		
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("***Erro ao conectar***");
		}finally{
			FabricaDeConexoes.fechaConexao();
		}
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
