package view;

import model.ConsultarSaldo;

public class ConsultarView {

	public void ExibirSaldo(ConsultarSaldo consultar) {
		System.out.println("___----____----Conta----____----___");
		System.out.println("Saldo: " +consultar.getConsulta() );
		System.out.println("___----____----Conta----____----___");
	}

	
}
