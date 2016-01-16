package br.uem.exemplo.controladores;

import br.uem.exemplo.modelo.Hardware;
import br.uem.exemplo.modelo.Produto;
import br.uem.exemplo.modelo.Software;

public class ProdutoControlador {

	public Produto criarSoftware(String descricao, double preco, String versao){
		Software produto= new Software();
		produto.setDescricao(descricao);
		produto.setPreco(preco);
		produto.setVersao(versao);
		return produto;
	}
	
	public Produto criarHardware(String descricao, double preco, String modelo){
		Hardware produto= new Hardware();
		produto.setDescricao(descricao);
		produto.setPreco(preco);
		produto.setModelo(modelo);
		return produto;
	}


}
