package principal;

import java.util.Date;

import elementos.Cliente;
import elementos.Pedido;
import elementos.Produto;

public class Principal {

	public static void main(String[] args) {
		int numero;
		String nome;
		String email;
		
		 Cliente cliente = new Cliente(1, "Joseph" , "Gustavolimaolima2265@gmail.com");
		 
		 Produto produto = new Produto(111,"Carro" , 40.000);
		 
		 Date date = new Date();
		 
		 Pedido pedido = new Pedido(1, 5, date, cliente, produto);

		 
		 pedido.exibirpedido(pedido);

	}

}
