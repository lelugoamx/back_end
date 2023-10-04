package controller;

import dao.AlunoDAO;
import dao.AlunoTelefoneDAO;
import model.Aluno;
import view.AlunoView;

import java.sql.SQLException;
import java.util.List;
import java.util.NoSuchElementException;

public class AlunoController {
		
	    private AlunoDAO AlunoDAO;
	   
	    private AlunoView AlunoView;

	   
	    public AlunoController() {
	        AlunoDAO = new AlunoDAO();
	        AlunoView = new AlunoView();
	    }

	    
	    public void adicionarAluno(int idAluno, String nome, int idade) throws SQLException {
	    	
	        Aluno aluno = new Aluno(idAluno, nome, idade);
	        
	        AlunoDAO.inserirAluno(aluno);
	    }

	    
	    public void ExibirlistarAlunos() throws SQLException {
	    
	        List<Aluno> listarAlunos = AlunoDAO.listarAlunos();
	        
	       
	        AlunoView.listaAlunos(listarAlunos);
	    }

	    
	    public void ExcluirAluno(int id) throws SQLException {
	    	boolean excluido = false;
	    	if(excluido) {
	    		AlunoDAO.excluirAluno(id);
	    		excluido = true;
	    		
	    
	    	}
	    
	    	AlunoView.contatoNaoEcontrado();;
	    }
		
	    public void AtualizaAluno(int idAluno, String nome, int idade) throws SQLException {
			Aluno aluno = new Aluno(idAluno,nome,idade);
			boolean redefinido = AlunoDAO.atualizarAluno(aluno);
			if(redefinido) {
				AlunoView.contatoatualizarAluno();
				
			}else {
				AlunoView.contatoNaoEcontrado();
			}
		}
	  
	}


