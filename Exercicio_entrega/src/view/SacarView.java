package view;


import model.Sacar;

public class SacarView {
	
	public void exibirSaque(Sacar sacar) {
		
		System.out.println("___----____----Conta----____----___");
		System.out.println("Sacar: " + sacar.getSacarSaldo());
		System.out.println("___----____----Conta----____----___");
		
	}
	

}
