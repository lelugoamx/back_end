package main;

import java.sql.SQLException;
import java.util.Scanner;
import controller.AlunoController;



public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        AlunoController alunoController = new AlunoController();

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar Aluno");
            System.out.println("2 - Adicionar Telefone");
            System.out.println("3 - Listar Alunos");
            System.out.println("4 - Exibir Aluno");
            System.out.println("5 - Atualizar Aluno");
            System.out.println("6 - Excluir Aluno");
            System.out.println("0 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a nova linha após a leitura do número

            switch (opcao) {
                case 1:
                	
                      System.out.println("Digite id do Aluno");
                      scanner.nextLine();
                      int idAluno = scanner.nextInt();
                      System.out.println("Digite nome do Aluno");
                      scanner.nextLine();
                      String nome = scanner.nextLine();
                      System.out.println("Digite a idade d Aluno");
                      scanner.nextLine();
                      int idade = scanner.nextInt();
                     
			            	alunoController.adicionarAluno(idAluno,nome,idade);
                      break;
            
               case 2:
                    alunoController.adicionaTelefone();
                    break;
                case 3:
                    alunoController.ExibirlistarAlunos();
                    break;
                case 4:
                    alunoController.();
                    break;
                case 5:
                	 System.out.println("Digite id do Aluno");
                     scanner.nextLine();
                     int idAluno2 = scanner.nextInt();
                     System.out.println("Digite nome do Aluno");
                     scanner.nextLine();
                     String nome2 = scanner.nextLine();
                     System.out.println("Digite a idade d Aluno");
                     scanner.nextLine();
                     int idade2 = scanner.nextInt();
                     alunoController.AtualizaAluno(idAluno2,nome2,idade2);
                    break;
                case 6:
                	 System.out.println("Digite id do Aluno");
                     scanner.nextLine();
                     int idAluno1 = scanner.nextInt();
                    alunoController.ExcluirAluno(idAluno1);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}

