package dao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import model.IMC_Model;

public class IMC_Dao {
	
	
	private List<IMC_Model>Cliente;
	
	public IMC_Dao() {
		
		Cliente = new ArrayList<>();
	
		
	}
	public void adicionarPessoa(IMC_Model IMC_Model) {
		Cliente.add(IMC_Model);
		
	
	}
		public List<IMC_Model> listapessoas() {
		       
			return Cliente;
		}
		public interface PessoaDAO {
		void inserir1(IMC_Model IMC_Model);
	    List<IMC_Model> listar();
	    IMC_Model maisVelha();
	}
		public class PessoaDAOImpl1 implements PessoaDAO {
		    private List<IMC_Model> pessoas = new ArrayList<>();

		    @Override
		    public void inserir1(IMC_Model IMC_Model) {
		        pessoas.add(IMC_Model);
		    }

		    @Override
		    public List<IMC_Model> listar() {
		        return pessoas;
		    }

		    @Override
		    public IMC_Model maisVelha() {
		        return pessoas.stream()
		                .max(Comparator.comparingInt(IMC_Model::getIdade))
		                .orElse(null);
		        
		    }

		}

		

	}


