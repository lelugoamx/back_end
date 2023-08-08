package controller;

import model.ConsultarSaldo;
import model.Depositar;
import model.Sacar;
import view.ConsultarView;
import view.DepositarView;
import view.SacarView;


public class SacarController {

	
	
	private ConsultarSaldo saldo;
	private Sacar saque;
	
	
	
	public void sacarsaldo() {
		
		saldo.setConsulta(saldo.getConsulta()-saque.getSacarSaldo());
		
		
		
	}
	

}
