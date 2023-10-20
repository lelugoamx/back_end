package controller;

import view.ProfessorView;
import dao.ProfessorDAO;
import model.Professor_Model;

public class ProfessorController {
	
	private ProfessorDAO professorDAO;
	private ProfessorView professorView;
	
	public ProfessorController() {
		professorDAO = new ProfessorDAO();
		professorView = new ProfessorView();
	}
	public void adicionarProfessor(String nome, String especialidade, String dataAdimissao) {
		Professor_Model prof = new Professor_Model(nome,especialidade,dataAdimissao);
		
		professorDAO.adicionarProfessor(prof);
		
	}
	public void atualizarProfessor(Integer id, String nome, String especialidade, String dataAdimissao) {
		boolean ProfessorAtualizado = professorDAO.atualizarProfessor(id, nome, especialidade,dataAdimissao);
		
		professorView.atualizarProfessor(ProfessorAtualizado);
	}
	public void listarUmProfessor() {
		professorView.exibirListaUmProfessor(professorDAO.listarUmProfessor());
	}

	public void removerProfessor(Integer id) {
		Professor_Model prof = professorDAO.buscarProfessor(id);

		boolean ProfessorRemovido = professorDAO.removerProfessor(prof);
		professorView.removerProfessor(ProfessorRemovido);
	}
	public void fecharProfessorDAO() {
		professorDAO.fechar();
    }

}
