package dao;

import model.Pais;
import java.util.ArrayList;
import java.util.List;

public class PaisDAO {
	// Cria uma coleção listaDePaises em forma de List, para armazenar objetos do tipo Pais
    private List<Pais> listaDePaises;

    // Construtor
    public PaisDAO() {
    	// Cria a instância da listaDePaises atráves do comando new ArrayList
        listaDePaises = new ArrayList<>();
    }

    /*
     * Método que adiciona um país, recebido por parâmetro, a listaDePaises
     */
    public void adicionarPais(Pais pais) {
    	// Adiciona um objeto país a lista
        listaDePaises.add(pais);
    }

    /*
     * Método que retorna a lista de países
     */
    public List<Pais> obterListaDePaises() {
    	// Retorna a lista de países
        return listaDePaises;
    }

    /*
     * Método que remove um pais, recebido por parâmetro, da listaDePaises
     */
    public void removerPais(Pais pais) {
    	// Remove um objeto país da lista
    	listaDePaises.remove(pais);
    }

    /*
     * Método que limpa a lista de países
     */
    public void limparListaDePaises() {
    	// Limpa a lista de países
        listaDePaises.clear();
    }

    /*
     * Método que obtem e retorna o primeiro país da lista
     */
    public Pais obterPrimeiroPais() {
    	/*
    	 * Verifica se a listaDePaises está vazia
    	 * O método listaDePaises.isEmpty() retorna verdadeiro ou falso sobre a lista
    	 * de países está vazia sim ou não.
    	 * Utilizamos o operador "!" (exclamação), para inverter o valor lógido a próxima condicional.
    	 * Em outras palavras, o trecho a seguir verifica se a lista for vazia, em sequencia inverte a
    	 * o valor lógico. 
    	 * Resumindo, se a lista não estiver vazia, a sistema entrará no IF
    	 */
        if (!listaDePaises.isEmpty()) {
        	/*
        	 * Retorna o primeiro país da lista atráves do método get(0).
        	 * Lembrando que os arrays / vetores / listas em java, sempre começam
        	 * na posição 0, portanto a primeira posição é  a posição  get(0),  a
        	 * segunda posição da lista, seria o get(1) e assim por diante.
        	 */
            return listaDePaises.get(0);
        }
        return null;
    }

    /*
     * Os métodos obterTerceiroPais e obterQuartoPais são semelhantes  ao  método
     * obterPrimeiroPais.
     */
    public Pais obterTerceiroPais() {
        if (listaDePaises.size() >= 3) {
            return listaDePaises.get(2);
        }
        return null;
    }

    public Pais obterQuartoPais() {
        if (listaDePaises.size() >= 4) {
            return listaDePaises.get(3);
        }
        return null;
    }
}
