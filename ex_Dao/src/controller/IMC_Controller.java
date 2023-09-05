package controller;

import java.util.List;

import dao.IMC_Dao;
import model.IMC_Model;

public class IMC_Controller {
	
	private  IMC_Dao IMC_Dao;

    public IMC_Controller() {
    	IMC_Dao = new IMC_Dao();
    }

    public void adicionarPessoa(String nome,int idade, double altura,double peso, String sexo) {
        IMC_Model pessoa = new  IMC_Model(nome, idade, altura, peso,sexo);
        IMC_Dao.adicionarPessoa(pessoa);
    }
    

    public List<IMC_Model> listapessoas() {
        return IMC_Dao.listapessoas();
    }

	
		
	}


