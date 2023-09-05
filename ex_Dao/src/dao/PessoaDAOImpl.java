package dao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import dao.IMC_Dao.PessoaDAO;
import model.IMC_Model;

public class PessoaDAOImpl {
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

	public static IMC_Model maisVelha() {
		return ;
	}
}
