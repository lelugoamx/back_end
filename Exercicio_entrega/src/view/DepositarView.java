package view;

import model.Depositar;
import model.ConsultarSaldo;

public class DepositarView {
	
	public void exibirDeposito(Depositar deposito) {
		System.out.println("___----____----Conta----____----___");
		System.out.println("Deposito: " + deposito.getDeposito());
		System.out.println("___----____----Conta----____----___");
	}
}
