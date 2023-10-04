package dao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Aluno;

public class AlunoDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/seubanco";
    private static final String USUARIO = "root";
    private static final String SENHA = "aluno";
    private Connection connection;

    public AlunoDAO() {
        
    }
    
 // Método para abrir uma conexão com o banco de dados
    public void abreConexao() throws SQLException {
        try {
            // Carrega o driver JDBC específico (substitua pelo driver do seu banco de dados)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Estabelece a conexão com o banco de dados usando os atributos URL, USUARIO e SENHA
            connection = DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (ClassNotFoundException | SQLException e) {
            // Lida com erros de carregamento do driver ou conexão
            throw new SQLException("Erro ao abrir a conexão com o banco de dados", e);
        }
    }

    // Método para fechar a conexão com o banco de dados
    public void fechaConexao() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                // Lida com erros de fechamento da conexão
                e.printStackTrace();
            }
        }
    }

    // Método para inserir um aluno no banco de dados
    public void inserirAluno(Aluno aluno) throws SQLException {
    	try (Connection connection = DriverManager.getConnection(URL, USUARIO, SENHA)) {
            String sql = "INSERT INTO pais (nome, capital) VALUES (?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, aluno.getIdAluno());
            preparedStatement.setString(2, aluno.getNome());
            preparedStatement.setInt(3, aluno.getIdade());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } 
    }

    // Método para buscar um aluno pelo ID (id_aluno) no banco de dados
    public Aluno buscarAlunoPorId(int id) throws SQLException {
    	try (Connection connection = DriverManager.getConnection(URL, USUARIO, SENHA)) {
            String sql = "select * aluno from id_aluno = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            ResultSet resultSet = preparedStatement.executeQuery();
            
            
            while (resultSet.next()) {
            	int idAluno = resultSet.getInt("idAluno");
                String nome = resultSet.getString("nome");
                int idade = resultSet.getInt("idade");
                
                Aluno aluno = new Aluno(idAluno,nome,idade);
                
                listarAlunos().add(aluno);
            }
    	}
        return null; 
    }

    // Método para atualizar os dados de um aluno no banco de dados
    public boolean atualizarAluno(Aluno aluno) throws SQLException {
    	try (Connection connection = DriverManager.getConnection(URL, USUARIO, SENHA)) {

			
			String sql = "UPDATE aluno SET id_aluno = ?, nome = ?, idade = ? WHERE id_aluno = ?;";

			
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, aluno.getIdAluno());
			preparedStatement.setString(2, aluno.getNome());
			preparedStatement.setInt(3, aluno.getIdade());


			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	
        return false;
    }
    

    // Método para excluir um aluno pelo ID (id_aluno) no banco de dados
    public boolean excluirAluno(int id) throws SQLException {
    	try (Connection connection = DriverManager.getConnection(URL, USUARIO, SENHA)) {
            String sql = "DELETE FROM aluno WHERE nome = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
 
        return false;
    }
    // Método para listar todos os alunos no banco de dados
    public List<Aluno> listarAlunos() throws SQLException {
        List<Aluno> alunos = new ArrayList<>();
    	
        try (Connection connection = DriverManager.getConnection(URL, USUARIO, SENHA)) {
        	
            String sql = "SELECT * FROM pais";
            
            Statement statement = (Statement) connection.prepareStatement(sql);
            
            ResultSet resultSet = ((java.sql.Statement) statement).executeQuery(sql);
            while (resultSet.next()) {
            	
            	int idAluno = resultSet.getInt("idAluno");
                String nome = resultSet.getString("nome");
                int idade = resultSet.getInt("idade");
                
                Aluno aluno = new Aluno(idAluno, nome, idade);
                
                listarAlunos().add(aluno);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return alunos;
    }
}
