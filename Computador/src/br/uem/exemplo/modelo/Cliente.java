package br.uem.exemplo.modelo;
import java.util.ArrayList;
import java.util.List;


public class Cliente {
	private String nome;
	private String cpf;
	private List<Pedido> pedidos = new ArrayList<Pedido>();
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public List<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	
}
