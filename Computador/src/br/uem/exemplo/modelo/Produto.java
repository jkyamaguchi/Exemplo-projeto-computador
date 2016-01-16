package br.uem.exemplo.modelo;

public class Produto {
	private String descricao;
	private double preco;

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	@Override
	public String toString() {
		return " Produto [descricao=" + descricao + "]";
	}
}
