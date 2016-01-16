package br.uem.exemplo.visao;

import java.util.Scanner;

import br.uem.exemplo.controladores.ClienteControlador;
import br.uem.exemplo.controladores.PersistenciaControlador;
import br.uem.exemplo.controladores.PedidoControlador;
import br.uem.exemplo.controladores.ProdutoControlador;
import br.uem.exemplo.modelo.Cliente;
import br.uem.exemplo.modelo.Produto;

public class ComputadorInterfaceTexto {

	//campos do formulario para cliente
	private String nome;
	private String cpf;
	
	//campos do formulario para produto
	private String descricao;
	private double preco;
	private String versao;
	private String modelo;
	private char tipoProduto;

	//campos do formulario para pedido
	public static int pedido = 1;

	//opcao da acao
	private int opcao;

	private Scanner scan = new Scanner(System.in);
	Cliente cliente;
	Produto produto;
	
	PersistenciaControlador persistenciaControlador = new PersistenciaControlador();
	ClienteControlador clienteControlador = new ClienteControlador();
	ProdutoControlador produtoControlador = new ProdutoControlador();
	PedidoControlador pedidoControlador = new PedidoControlador();



	public void menu(){
		String entrada;
		System.out.println("Escolha uma opcao");
		System.out.println("1 - Sair");
		System.out.println("2 - Novo pedido");
		System.out.println("3 - Listar pedidos");
		System.out.println("Opcao: ");
		entrada = scan.next();
		opcao = Integer.parseInt(entrada);
	}

	public void preencherDadosCliente(){
		System.out.println("--- Dados do cliente --- ");
		System.out.print("Nome: ");
		nome = scan.next();

		System.out.print("CPF: ");
		cpf = scan.next();
		cliente = clienteControlador.criar(nome, cpf);
		persistenciaControlador.getClientes().add(cliente);
	}
	
	public void preencherDadosProduto(){
		System.out.println("--- Dados do produto --- ");
		System.out.print("Escolha o tipo de produto: ");
		System.out.print("h = Hardware ");
		System.out.println("s = Software ");

		tipoProduto = scan.next().charAt(0); //obtem o character da String

		System.out.print("Descricao: ");
		descricao = scan.next();

		System.out.print("Preco: ");
		preco = Double.parseDouble(scan.next());
		
		switch (tipoProduto) {
		case 's':
			System.out.print("Versao: ");
			versao = scan.next();
			produto = produtoControlador.criarSoftware(descricao, preco, versao);
			break;
		case 'h':
			System.out.print("Modelo: ");
			modelo = scan.next();
			produto = produtoControlador.criarHardware(descricao, preco, modelo);
			break;

		default:
			System.out.println("Opcao invalida");
			break;
		}
		persistenciaControlador.getProdutos().add(produto);
		
	}
	
	public void preencherDadosPedido(){
		preencherDadosCliente();
		preencherDadosProduto();
	}
	
	public void executar(){
		do{
			menu();
			switch (opcao){
			
			case 2:
				preencherDadosPedido();
				persistenciaControlador.getPedidos().add(pedidoControlador.criar(produto, cliente));
				break;
				
			case 3:
				persistenciaControlador.listarPedidos();
				break;

			}
		}while(opcao != 1);
		
	}

}
