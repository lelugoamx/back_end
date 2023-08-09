package controller;

import model.CaixaEletronico;
import view.CaixaEletronicoview;

public class CaixaEletronicocontroller {
	private CaixaEletronico model;
    private CaixaEletronicoview view;

    public CaixaEletronicocontroller (CaixaEletronico model, CaixaEletronicoview view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        boolean isRunning = true;

        while (isRunning) {
            int opcao = view.displayMenu();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo: " + model.getBalance());
                    break;
                case 2:
                    double withdrawAmount = view.askAmount("Retirado");
                    model.withdraw(withdrawAmount);
                    break;
                case 3:
                    double depositAmount = view.askAmount("Depositado");
                    model.deposit(depositAmount);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

}
