package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;


import model.Professor_Model;
import util.LoggerUtil;

public class ProfessorDAO {
	 private EntityManagerFactory produtorDeEntidades = Persistence.createEntityManagerFactory("exemplo-jpa");
	   
	  
	    private EntityManager gerenciarEntidades;
	    
	    public ProfessorDAO() {
	    	gerenciarEntidades = produtorDeEntidades.createEntityManager();
	    }
	    	 public void adicionarProfessor(Professor_Model Professor_Model) {
	    	        gerenciarEntidades.getTransaction().begin(); 
	    	        gerenciarEntidades.persist(Professor_Model);
	    	        gerenciarEntidades.getTransaction().commit();
	    	    }
	    	 public boolean atualizarProfessor(Integer id, String nome, String especialidade, String dataAdimissao) {
	    		 Professor_Model professor_Model = buscarProfessor(id);

	    	        gerenciarEntidades.getTransaction().begin();
	    	        professor_Model.setNome(nome);
	    	        professor_Model.setEspecialidade(especialidade);
	    	        professor_Model.setDataAdmissao(dataAdimissao);
	    	        gerenciarEntidades.getTransaction().commit();
	    	        return true;
	    	    }

	    	    public Professor_Model buscarProfessor(Integer id) {
	    	        return gerenciarEntidades.find(Professor_Model.class, id);
	    	    }
	    	    public List<Professor_Model> listarUmProfessor() {
	    	        try {
	    	            return gerenciarEntidades.createQuery("SELECT p FROM Pais p ORDER BY p.nome limit 1", Professor_Model.class)
	    	                    .getResultList();
	    	        }catch (NoResultException e) {
	    	            throw new EntityNotFoundException("Nenhum Professor encontrado.");
	    	        } catch (Exception e) {
	    	            LoggerUtil.logError("Erro ao listarUmProfessor: ", e);
	    	            return new ArrayList<>(); 
	    	        } 
	    	    }

	    	    public boolean removerProfessor(Professor_Model Professor_Model) {
	    	        try {
	    	            gerenciarEntidades.getTransaction().begin();
	    	            Professor_Model = gerenciarEntidades.merge(Professor_Model);
	    	            gerenciarEntidades.remove(Professor_Model);
	    	            gerenciarEntidades.getTransaction().commit();
	    	            return true;
	    	        } catch (Exception e) {
	    	        	LoggerUtil.logError("Erro ao remover Professor: ", e);
	    	            return false;
	    	        }
	    	    }
	    	    
	    	    public void fechar() {
	    	        gerenciarEntidades.close();
	    	        produtorDeEntidades.close();
	    	    }
	    	}




