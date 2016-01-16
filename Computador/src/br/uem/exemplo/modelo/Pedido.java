package br.uem.exemplo.modelo;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	public static int contador = 0;
	private int numero;
	private Cliente cliente;
	private List<Produto> produtos = new ArrayList<Produto>();
	
	public Pedido(){
		contador ++;
		setNumero(contador);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	public void addProduto(Produto produto) {
		this.produtos.add(produto);
	}
	
	public String listarProdutos(){
		String resultado=" ";
		
		for (Produto p: this.produtos){
			resultado = resultado.concat(p.toString());
		}
		return resultado;
	}
	
	public String toString(){
		return "Pedido numero: " + numero + " - Cliente: " + this.cliente.getNome() + listarProdutos();
	}
}
