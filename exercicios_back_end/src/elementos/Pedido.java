package elementos;

import java.util.Date;

public class Pedido {
	
	private int idpedido;
	private int quantidade;
	private Date data;
	private Cliente cliente;
	private Produto produto;
	
	public Pedido(int idpedido, int quantidade, Date data, Cliente cliente, Produto produto) {
		this.CriarPedido(idpedido, quantidade, data, cliente,produto);
	}
	
	public void CriarPedido(int idpedido, int quantidade, Date data, Cliente cliente, Produto produto) {
		   this.cliente = cliente;
		   this.data = data;
		   this.idpedido = idpedido;
		   this.produto = produto;
		   this.quantidade = quantidade;
		   
	}
	
  

public int getIdpedido() {
	return idpedido;
}

public void setIdpedido(int idpedido) {
	this.idpedido = idpedido;
}

public int getQuantidade() {
	return quantidade;
}

public void setQuantidade(int quantidade) {
	this.quantidade = quantidade;
}

public Date getData() {
	return data;
}

public void setData(Date data) {
	this.data = data;
}

public Cliente getCliente() {
	return cliente;
}

public void setCliente(Cliente cliente) {
	this.cliente = cliente;
}

public Produto getProduto() {
	return produto;
}

public void setProduto(Produto produto) {
	this.produto = produto;
}


public void exibirpedido(Pedido pedido) {
	System.out.println("Pedidos...");
	System.out.println("ID: " + pedido.getIdpedido());
	System.out.println("Cliente: " + pedido.getCliente().getNome());
	System.out.println("Produto: " + pedido.getProduto().getNome());
	System.out.println("Quantidade " + pedido.getQuantidade());
	System.out.println("Data: "+pedido.getData());
	
}



@Override
public String toString() {
	return "Pedido [idpedido=" + idpedido + ", quantidade=" + quantidade + ", data=" + data + ", cliente=" + cliente
			+ ", produto=" + produto + "]";
}

}
