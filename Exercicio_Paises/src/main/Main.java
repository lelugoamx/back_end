package main;

import java.util.Scanner;

import controller.Paises_controller;

public class Main {

	public static void main(String[] args) {
		Paises_controller paisescontroller = new Paises_controller();
		Scanner lerdados = new Scanner(System.in);

		int opcao = -1;
		while (opcao != 0) {

			System.out.println("____----Menu----____");
			System.out.println("1-Adicionar Pais/capital");
			System.out.println("2-Exibir paises/capital");
			System.out.println("0-Sair do programa");
			System.out.println("Escolha uma das opçoes acima");
			opcao = lerdados.nextInt();

			switch (opcao) {
			case 1: 
				System.out.println("Digite o nome do Pais");
				lerdados.nextLine();
				String pais = lerdados.next();

				System.out.println("Digite o nome da capital");
				lerdados.nextLine();
				String capital = lerdados.next();

				paisescontroller.AdicionarPais(pais, capital);
				
				break;
			
			case 2: 
				paisescontroller.exibirlistadepaises();
				break;
			
			case 0: 
				System.out.println("Saindo.");
				break;
			
			default:
				System.out.println("Opçao invalida");
				break;

			}

		}

	}

}
