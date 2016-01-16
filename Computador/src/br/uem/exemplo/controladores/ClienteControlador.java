package br.uem.exemplo.controladores;

import br.uem.exemplo.modelo.Cliente;
import br.uem.exemplo.modelo.Pedido;

public class ClienteControlador {
	
	public Cliente criar(String nome, String cpf){
		Cliente cliente= new Cliente();
		cliente.setNome(nome);
		cliente.setCpf(cpf);
		return cliente;
	}
	
	public void associarPedido(Cliente cliente, Pedido pedido){
		cliente.getPedidos().add(pedido);
	}
}
