package main;

import java.util.Scanner;


import controller.ProfessorController;

public class ProfessorMain {
	public static void main(String[] args) {
		ProfessorController professorController = new ProfessorController();
		Scanner scanner = new Scanner(System.in);
		
		int opcao = -1;
		
		while (opcao != 0) {

	
			System.out.println("==== Menu ====");
			System.out.println("1. Adicionar Professor");
			System.out.println("2. Listar Apenas 1 Professor");
			System.out.println("3. Remover Professor da lista");
			System.out.println("4. Atualizar professor");
			System.out.println("0. Sair");
			System.out.print("Escolha uma opcao: ");
			
			try {

				opcao = scanner.nextInt();
	
				switch (opcao) {
	
				case 1:
					System.out.print("Digite o nome do Professor: ");
					scanner.nextLine();
					String nome = scanner.nextLine();
	
					System.out.print("Digite a especialidade do Professor " + nome + ": ");
					String especialidade = scanner.nextLine();
					
					System.out.print("Digite a dataAdmissao do Professor " + nome + especialidade + ": ");
					String dataAdmissao = scanner.nextLine();
	
					professorController.adicionarProfessor(nome, especialidade,dataAdmissao);
					break;
					
				case 2:
					professorController.listarUmProfessor();
					break;
					
				
				case 3:
					System.out.println("Digite o ID do Professor a ser removido: ");

					Integer idProfessorRemover = scanner.nextInt();
	
					professorController.removerProfessor(idProfessorRemover);
					break;
					
				case 4:
					System.out.println("Digite o ID do Professor que deseja atualizar: ");
					Integer idProfessorAtualizar = scanner.nextInt();
					
					System.out.print("Digite o nome do Professor: ");
					scanner.nextLine();
					String nomeAtualizar = scanner.nextLine();
	
					System.out.print("Digite a especialidade do Professor " + nomeAtualizar + ": ");
					String especialidadeAtualizar = scanner.nextLine();
					
					System.out.print("Digite a dataAdmissao do Professor " + nomeAtualizar + especialidadeAtualizar + ": ");
					String dataAdmissaoAtualizar = scanner.nextLine();
	
					professorController.atualizarProfessor(idProfessorAtualizar,nomeAtualizar, especialidadeAtualizar, dataAdmissaoAtualizar);
					break;
	
				case 0:
					System.out.println("Saindo...");
					professorController.fecharProfessorDAO();	
					break;
	
				default:
					System.out.println("Opcao invalida.");
					break;
				}
			} catch (java.util.InputMismatchException e) {
				System.out.println("Opcao invalida. Por favor, digite um numero inteiro valido.");
                		scanner.nextLine();
			}
		}
		
		scanner.close();
	}
}


