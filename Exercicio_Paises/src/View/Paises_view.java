package View;
import java.util.List;
import model.Paises;

public class Paises_view {

	public void exibirpaises(List<Paises> pais) {
		System.out.println("Lista de Paises");
		
		for (Paises Pais : pais) {
			System.out.println("Pais: " + Pais.getPaises() + "-Capital: " + Pais.getCapital());
			
		}
		System.out.println("________________________________");
		
	}
}
