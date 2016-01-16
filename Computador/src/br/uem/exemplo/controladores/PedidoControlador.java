package br.uem.exemplo.controladores;

import br.uem.exemplo.modelo.Cliente;
import br.uem.exemplo.modelo.Pedido;
import br.uem.exemplo.modelo.Produto;

public class PedidoControlador {
	
	private int quantidade;
	
	
	public Pedido criar(Produto produto, Cliente cliente){
		Pedido pedido = new Pedido();
		pedido.setCliente(cliente);
		pedido.addProduto(produto);
		quantidade ++;
		return pedido;
	}

	public int getQuantidade() {
		return quantidade;
	}

}
