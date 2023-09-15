package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.AgendaModel;



public class AgendaDao {
	private final String url = "jdbc:mysql://localhost:3306/PrimeiroBanco";
    private final String usuario = "root";
    private final String senha = "aluno";
    private Connection connection;
    
    public void AgendaDao(AgendaModel agenda ) {
        try (Connection connection = DriverManager.getConnection(url, usuario, senha)) {
            String sql = "INSERT INTO contato (id,nome,email,telefone) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,agenda.getId());
            preparedStatement.setString(2,agenda.getNome());
            preparedStatement.setString(3,agenda.getEmail());
            preparedStatement.setInt(4,agenda.getTelefone());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
        	e.printStackTrace();
        }
        
            
        }
        public List<AgendaModel> ObterListadeContatos() {
            List<AgendaModel> ListaContatos = new ArrayList<>();

            try (Connection connection = DriverManager.getConnection(url, usuario, senha)) {
            	
                String sql = "SELECT * FROM contato";
                
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    
                	int id = resultSet.getInt("id");
                	String nome = resultSet.getString("nome");
                    String email = resultSet.getString("email");
                    int telefone = resultSet.getInt("telefone");
                    
                    AgendaModel pais = new AgendaModel(id,nome,email,telefone);
                    
                    ListaContatos.add(pais);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            return ListaContatos;
        }
        
            public void removerContato(AgendaModel agenda) {
            	try (Connection connection = DriverManager.getConnection(url, usuario, senha)) {
                    String sql = "DELETE FROM contado WHERE nome = ?";
                    PreparedStatement preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.setString(1, agenda.getNome());
                    preparedStatement.executeUpdate();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }


            public AgendaModel obtercontatoporid() {
            	try (Connection connection = DriverManager.getConnection(url, usuario, senha)) {
                    String sql = "SELECT id FROM contato;";
                    PreparedStatement preparedStatement = connection.prepareStatement(sql);
                    ResultSet resultSet = preparedStatement.executeQuery();
                    if (resultSet.next()) {
                        int id = resultSet.getInt("id");
                    	String nome = resultSet.getString("nome");
                        String email = resultSet.getString("email");
                        int telefone = resultSet.getInt("telefone");
                        return new AgendaModel(id,nome,email,telefone);
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return null;
            }

          
            public AgendaModel obterContatoporNome() {
            	try (Connection connection = DriverManager.getConnection(url, usuario, senha)) {
                    String sql = "SELECT nome FROM contato;";
                    PreparedStatement preparedStatement = connection.prepareStatement(sql);
                    ResultSet resultSet = preparedStatement.executeQuery();
                    if (resultSet.next()) {
                    	int id = resultSet.getInt("id");
                    	String nome = resultSet.getString("nome");
                        String email = resultSet.getString("email");
                        int telefone = resultSet.getInt("telefone");
                        return new AgendaModel(id,nome,email,telefone);
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return null;
            }
            
            public AgendaModel EditarContato() {
                if (abreConexao()) {
                    try {
                        String sql = "SELECT * FROM pais LIMIT 3, 1;";
                        PreparedStatement preparedStatement = connection.prepareStatement(sql);
                        ResultSet resultSet = preparedStatement.executeQuery();
                        if (resultSet.next()) {
                        	int id = resultSet.getInt("id");
                        	String nome = resultSet.getString("nome");
                            String email = resultSet.getString("email");
                            int telefone = resultSet.getInt("telefone");
                            return new AgendaModel(id,nome,email,telefone);
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    } finally {
                        fechaConexao(); 
                    }
                }
                return null;
            
            
            
            
            
            
            
            
            
            
          
            
            
    }
        public boolean testaConexao() {
        	boolean conectou = abreConexao();
        	
        	fechaConexao();
        	
        	return conectou;
        }
        
        public boolean abreConexao() {
        	try {
               
                Class.forName("com.mysql.cj.jdbc.Driver");

               
                connection = DriverManager.getConnection(url, usuario, senha);

                if (connection != null) {
                    return true;
                } else {
                    return false;
                }
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
                return false;
            }
        }
        
        public void fechaConexao() {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        

}
