package model;

public class CaixaEletronico {

	private double balance;

    public CaixaEletronico(double Balance) {
        balance = Balance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double Valor) {
        if (Valor > 0 && Valor <= balance) {
            balance -= Valor;
            System.out.println("Saque de " + Valor + "  Saldo atual: " + balance);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void deposit(double Valor) {
        if (Valor > 0) {
            balance += Valor;
            System.out.println("Depósito de " + Valor + " Saldo atual: " + balance);
        } else {
            System.out.println("Valor inválido.");
        }
    }
}
