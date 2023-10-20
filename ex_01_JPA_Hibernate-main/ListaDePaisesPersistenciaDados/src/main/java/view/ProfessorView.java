package view;

import java.util.List;


import model.Professor_Model;

public class ProfessorView {
	
	public void exibirListaUmProfessor(List<Professor_Model> list) {
		
		System.out.println("==== Lista de Professores ====");
		System.out.println("--------------------");
	}
	
	public void atualizarProfessor(boolean ProfessorAtualizado) {
	
		if (ProfessorAtualizado) {
			System.out.println("Professor foi atualizado com sucesso!\n");
		} else {
			System.out.println("Professor não foi atualizado.\n");
		}
	}
		public void removerProfessor(boolean removerProfessor) {
			
			if (removerProfessor) {
				System.out.println("Professor removido com sucesso!\n");
			} else {
				System.out.println("Professor Não encontrado na lista.\n");
			}
		
		}
		public void exibirMensagem(String msg) {
			System.out.println(msg);
		}

}
