package model;

public class Depositar {
	
	double Saldo;
	double Deposito;
	
	public Depositar(double Saldo, double Deposito) {
		
		this.Exibirdeposito(Saldo, Deposito);
	}

	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double saldo) {
		Saldo = saldo;
	}

	public double getDeposito() {
		return Deposito;
	}

	public void setDeposito(double deposito) {
		Deposito = deposito;
	}
public void Exibirdeposito(double Saldo, double deposito) {
		
		this.Deposito = deposito;
		this.Saldo = Saldo;
}
	

}
