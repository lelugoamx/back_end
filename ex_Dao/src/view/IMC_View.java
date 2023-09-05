package view;

import java.util.List;
import java.util.Scanner;
import model.IMC_Model;
import controller.IMC_Controller;
import dao.IMC_Dao;
import dao.PessoaDAOImpl;


public class IMC_View {
	
	private IMC_Controller IMC_Controller;
	private Scanner Scanner;
    
	
	public IMC_View() {
		IMC_Controller = new IMC_Controller();
		Scanner = new Scanner(System.in);
		
	}
	
	public void MENU() {
		int opcao;
		do {
			System.out.println("MENU");
			System.out.println("1. Adicionar Pessoa");
			System.out.println("2. listar de pessoa");
			System.out.println("3. pessoa mais velha");
			System.out.println("4. Sair");
			System.out.print("-------------");
			opcao = Scanner.nextInt();
			
			switch (opcao ) {
			case 1:
				adicionarPessoa(); 
				break;
				
			case 2:
				listarpessoas();
				break;
				
			case 3:
				IMC_Model PessoamaisVelha = PessoaDAOImpl.maisVelha();
                if (PessoamaisVelha != null) {
                    System.out.println("Pessoa mais velha: " + PessoamaisVelha.getNome() + ", Idade: " + PessoamaisVelha.getIdade());
                } else {
                    System.out.println("Nenhuma pessoa cadastrada.");
                }
                break;
				
			case 4:
                System.out.println("Encerrando o programa.");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    } while (opcao != 4);
}

public void adicionarPessoa() {
    System.out.print("Nome: ");
    String nome = Scanner.next();
    System.out.print("Sexo: ");
    String sexo = Scanner.next();
    System.out.print("Altura: ");
    double altura = Scanner.nextDouble();
    System.out.print("Idade: ");
    int idade = Scanner.nextInt();
    System.out.print("Peso: ");
    double peso = Scanner.nextDouble();

    IMC_Controller.adicionarPessoa(nome, idade, altura, peso,sexo);
    double imc = calcularIMC(peso, altura);
    System.out.println("IMC: " + imc);
    System.out.println("Pessoa adicionada com sucesso!");
}

private double calcularIMC(double peso, double altura) {
    return peso / (altura * altura);

}

public void listarpessoas() {
    List<IMC_Model> pessoas = IMC_Controller.listapessoas();
    System.out.println("LISTA DE PESSOAS:");
    for (IMC_Model pessoa : pessoas) {
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Sexo: " + pessoa.getSexo());
        System.out.println("Altura: " + pessoa.getAltura());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Peso: " + pessoa.getPeso());
        System.out.println("IMC: " + pessoa.calcularIMC());
        System.out.println("-------------");
    }
    
}

public static void main(String[] args) {
    IMC_View view = new IMC_View();
    view.MENU();
}

	}
	


