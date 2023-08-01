package model;

public class Paises {
	
	String paises;
	String capital;
	
	
	
	public Paises(String paises , String capital) {
		
		this.ExibirPaises(paises, capital);
	
	}
	public void ExibirPaises(String paises, String capital) {
		
		this.paises = paises;
		this.capital = capital;
		
	}
	public String getPaises() {
		return paises;
	}
	public void setPaises(String paises) {
		this.paises = paises;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	
	}
	
	

}
