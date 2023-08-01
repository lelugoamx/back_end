package controller;

import View.Paises_view;
import model.Paises;

import java.util.ArrayList;
import java.util.List;

public class Paises_controller {
	
	private List<Paises> Listadepaises;
	private Paises_view paises_view;

	public Paises_controller() {
		
		Listadepaises = new ArrayList<>();
		paises_view = new Paises_view();
		
	}
	public void AdicionarPais(String pais,String capital) {
		
		Paises paises = new Paises(pais, capital);
	    Listadepaises.add(paises);
	}
	
	public void exibirlistadepaises() {
		paises_view.exibirpaises(Listadepaises);
	}
			
}
