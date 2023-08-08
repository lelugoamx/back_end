package model;

public class Sacar {

	double Saldo;
	double SacarSaldo;
	
	public Sacar(double Saldo, double SacarSaldo) {
		
		this.ExibirSaque(Saldo, SacarSaldo);
		
	}
	
	public void ExibirSaque(double Saldo, double SacarSaldo) {
		this.SacarSaldo = SacarSaldo;
		this.Saldo = Saldo;
		
	}

	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double saldo) {
		Saldo = saldo;
	}

	public double getSacarSaldo() {
		return SacarSaldo;
	}

	public void setSacarSaldo(double sacarSaldo) {
		SacarSaldo = sacarSaldo;
	}
	
	
}
