package view;

import java.util.Scanner;

public class CaixaEletronicoview {
	
	 private Scanner Lerdados = new Scanner(System.in);

	    public int displayMenu() {
	        System.out.println("==== Caixa Eletrônico ====");
	        System.out.println("1. Saldo");
	        System.out.println("2. Sacar");
	        System.out.println("3. Depositar");
	        System.out.println("4. Sair");
	        System.out.print("Escolha uma opção: ");
	        return Lerdados.nextInt();
	    }

	    public double askAmount(String action) {
	        System.out.print("Digite o valor  " + action + ": ");
	        return Lerdados.nextDouble();
	    }
}
