package controller;
import model.ConsultarSaldo;
import model.Depositar;
import view.ConsultarView;
import view.DepositarView;

public class DepositarController {
	
	private ConsultarSaldo saldo;
	private Depositar deposito;
	
	
	public void exibirdeposito() {
		
		saldo.setConsulta(saldo.getConsulta()+deposito.getDeposito());
	}
		
		

}
