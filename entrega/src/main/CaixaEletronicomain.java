package main;

import controller.CaixaEletronicocontroller;
import model.CaixaEletronico;
import view.CaixaEletronicoview;

public class CaixaEletronicomain {
	
	 public static void main(String[] args) {
	        CaixaEletronico model = new  CaixaEletronico(1000.0);
	        CaixaEletronicoview view = new  CaixaEletronicoview();
	        CaixaEletronicocontroller controller = new  CaixaEletronicocontroller(model, view);

	        controller.run();
	    }

}
