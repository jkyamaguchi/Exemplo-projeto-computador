package br.uem.exemplo.controladores;

import java.util.ArrayList;
import java.util.List;

import br.uem.exemplo.modelo.Cliente;
import br.uem.exemplo.modelo.Pedido;
import br.uem.exemplo.modelo.Produto;
/**
 * Essa classe gerencia um conjunto de entidades do sistema, simulando a interface com o banco de dados.
 * @author juliana
 *
 */
public class PersistenciaControlador {

	//entidades armazenadas
	List<Cliente> clientes = new ArrayList<Cliente>();
	List<Pedido> pedidos = new ArrayList<Pedido>();
	List<Produto> produtos = new ArrayList<Produto>();
	
	public List<Cliente> getClientes() {
		return clientes;
	}
	public List<Pedido> getPedidos() {
		return pedidos;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	
	public void listarPedidos(){
		for (Pedido p: this.pedidos){
			System.out.println(p.toString());
			
		}
	}
}
