package main;

import java.util.Scanner;

import controller.ConsultarSaldoController;
import controller.DepositarController;
import controller.SacarController;
import model.Sacar;
import model.Depositar;
import model.ConsultarSaldo;
import view.SacarView;
import view.ConsultarView;
import view.DepositarView;

public class BancoPrincipal {


	public static void main(String[] args) {
		
		ConsultarSaldoController consulta = new ConsultarSaldoController();
		DepositarController depositar = new DepositarController();
		SacarController sacar = new SacarController();
		
		Scanner lerdados = new Scanner(System.in);
		
		int opcao = 0;
		
		while(opcao != 0);{
			
			System.out.println("___***MENU***___");
			System.out.println("1. Consultar saldo");
			System.out.println("2. Depositar");
			System.out.println("3. Sacar");
			System.out.println("0. Sair");
			
			opcao = lerdados.nextInt();
			

			switch (opcao) {

			
			case 1:
			
				consulta.mostrar();
				break;
				
				
			case 2:
				  
				 System.out.println("Digita o valor que deseja depositar");
				 lerdados.nextInt();
				 int despo =  lerdados.nextInt();
				 System.out.println("Valor báncario: " + despo );
				break;
			case 3:
				System.out.println("Digita o valor que deseja sacar");
				lerdados.nextInt();
				
				int receba = lerdados.nextInt();
				
				System.out.println("Valor báncario: " + receba + consulta );
				
			case 0:
				System.out.println("Saindo...");
				break;
			
			default:
				System.out.println("Opçao invalida");
				break;
			}
			lerdados.close();
			
				
				

	}

	}
}
